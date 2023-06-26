package com.yuan.newbeecopy.service;

import com.yuan.newbeecopy.api.mall.Vo.UserAddressVO;
import com.yuan.newbeecopy.pojo.UserAddress;

import java.util.List;

public interface MallUserAddressService {
    /**
     * 获取地址列表
     * @param userId
     * @return
     */
    List<UserAddressVO> getMyAddresses(Long userId);

    /**
     * 添加用户地址
     * @param userAddress
     * @return
     */
    Boolean saveUserAddress(UserAddress userAddress);

    /**
     *获取收货地址详情
     * @param addressId
     * @return
     */
    UserAddress getMallUserAddressById(Long addressId);

    /**
     * 修改用户地址
     * @param userAddress
     * @return
     */
    Boolean updateMallUserAddress(UserAddress userAddress);

    /**
     * 获取默认地址
     * @param userId
     * @return
     */
    UserAddress getMyDefaultAddressByUserId(Long userId);

    /**
     * 按id删除
     * @param addressId
     * @return
     */
    Boolean deleteById(Long addressId);
}
