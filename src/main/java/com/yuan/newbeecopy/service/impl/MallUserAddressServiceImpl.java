package com.yuan.newbeecopy.service.impl;

import com.yuan.newbeecopy.api.mall.Vo.UserAddressVO;
import com.yuan.newbeecopy.common.NewBeeException;
import com.yuan.newbeecopy.common.ServiceResultEnum;
import com.yuan.newbeecopy.mapper.UserAddressMapper;
import com.yuan.newbeecopy.pojo.UserAddress;
import com.yuan.newbeecopy.service.MallUserAddressService;
import com.yuan.newbeecopy.utils.BeanUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class MallUserAddressServiceImpl implements MallUserAddressService {
    @Resource
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserAddressVO> getMyAddresses(Long userId) {
        List<UserAddress> myAddressList = userAddressMapper.findMyAddressList(userId);
        List<UserAddressVO> userAddressVOS = BeanUtil.copyList(myAddressList, UserAddressVO.class);
        return userAddressVOS;
    }

    @Override
    public Boolean saveUserAddress(UserAddress userAddress) {
        Date now = new Date();
        if (userAddress.getDefaultFlag().intValue() == 1) {
            UserAddress myDefaultAddress = userAddressMapper.getMyDefaultAddress(userAddress.getUserId());
            if (myDefaultAddress != null) {
                myDefaultAddress.setDefaultFlag((byte) 0);
                myDefaultAddress.setUpdateTime(now);
                int updateResult = userAddressMapper.updateByPrimaryKeySelective(myDefaultAddress);
                if (updateResult < 1) {
                    NewBeeException.fail(ServiceResultEnum.DB_ERROR.getResult());
                }
            }
        }
        return userAddressMapper.insertSelective(userAddress) > 0;
    }

    @Override
    public UserAddress getMallUserAddressById(Long addressId) {
        UserAddress userAddress = userAddressMapper.selectByPrimaryKey(addressId);
        if (userAddress == null) {
            NewBeeException.fail(ServiceResultEnum.DATA_NOT_EXIST.getResult());
        }
        return userAddress;
    }

    @Override
    public Boolean updateMallUserAddress(UserAddress userAddress) {
        UserAddress mallUserAddressById = getMallUserAddressById(userAddress.getAddressId());
        Date now = new Date();
        if (userAddress.getDefaultFlag().intValue() == 1) {
            //修改为默认地址，需要将原有的默认地址修改掉
            UserAddress myDefaultAddress = userAddressMapper.getMyDefaultAddress(userAddress.getUserId());
            if (myDefaultAddress != null && !myDefaultAddress.getAddressId().equals(mallUserAddressById.getAddressId())) {
                //存在默认地址且默认地址并不是当前修改的地址
                myDefaultAddress.setDefaultFlag((byte) 0);
                myDefaultAddress.setUpdateTime(now);
                int updateResult = userAddressMapper.updateByPrimaryKey(myDefaultAddress);
                if (updateResult < 1) {
                    NewBeeException.fail(ServiceResultEnum.DB_ERROR.getResult());
                }
            }
        }
        userAddress.setUpdateTime(now);
        return userAddressMapper.updateByPrimaryKeySelective(userAddress) > 0;
    }

    @Override
    public UserAddress getMyDefaultAddressByUserId(Long userId) {
        return userAddressMapper.getMyDefaultAddress(userId);
    }

    @Override
    public Boolean deleteById(Long addressId) {
        return userAddressMapper.deleteByPrimaryKey(addressId) > 0;
    }
}
