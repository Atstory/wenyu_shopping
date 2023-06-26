package com.yuan.newbeecopy.api.mall;

import com.yuan.newbeecopy.api.mall.Vo.UserAddressVO;
import com.yuan.newbeecopy.api.mall.param.SaveMallUserAddressParam;
import com.yuan.newbeecopy.api.mall.param.UpdateMallUserAddressParam;
import com.yuan.newbeecopy.common.NewBeeException;
import com.yuan.newbeecopy.common.ServiceResultEnum;
import com.yuan.newbeecopy.config.annotation.TokenToMallUser;
import com.yuan.newbeecopy.pojo.User;
import com.yuan.newbeecopy.pojo.UserAddress;
import com.yuan.newbeecopy.service.MallUserAddressService;
import com.yuan.newbeecopy.utils.BeanUtil;
import com.yuan.newbeecopy.utils.Result;
import com.yuan.newbeecopy.utils.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Api(value = "v1", tags = "5.新蜂商城用户地址相关接口")
public class UserAddressAPI {
    @Resource
    private MallUserAddressService userAddressService;

    @GetMapping("/address")
    @ApiOperation(value = "我的收货地址列表", notes = "")
    public Result<List<UserAddressVO>> getAddress(@TokenToMallUser User user) {
        return ResultGenerator.genSuccessResult(userAddressService.getMyAddresses(user.getUserId()));
    }

    @PostMapping("/address")
    @ApiOperation(value = "添加地址", notes = "")
    public Result saveAddress(@TokenToMallUser User user,
                              @RequestBody SaveMallUserAddressParam saveMallUserAddressParam) {
        UserAddress userAddress = new UserAddress();
        BeanUtil.copyProperties(saveMallUserAddressParam, userAddress);
        userAddress.setUserId(user.getUserId());
        Boolean updateResult = userAddressService.saveUserAddress(userAddress);
        if (updateResult) {
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("添加失败");
    }

    @PutMapping("/address")
    @ApiOperation(value = "修改收货地址", notes = "")
    public Result updateMallUserAddress(@TokenToMallUser User user,
                                        @RequestBody UpdateMallUserAddressParam updateMallUserAddressParam) {
        UserAddress mallUserAddressById = userAddressService.getMallUserAddressById(updateMallUserAddressParam.getAddressId());
        if (!user.getUserId().equals(mallUserAddressById.getUserId())) {
            return ResultGenerator.genFailResult(ServiceResultEnum.REQUEST_FORBIDEN_ERROR.getResult());
        }
        UserAddress userAddress = new UserAddress();
        BeanUtil.copyProperties(updateMallUserAddressParam, userAddress);
        userAddress.setUserId(user.getUserId());
        Boolean updateResult = userAddressService.updateMallUserAddress(userAddress);
        if (updateResult) {
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult("修改失败");
    }

    @GetMapping("/address/{addressId}")
    @ApiOperation(value = "获取收货地址详情", notes = "传参为地址id")
    public Result<UserAddressVO> getMallUserAddressDetail(@PathVariable("addressId") Long addressId,
                                                          @TokenToMallUser User user) {
        UserAddress mallUserAddressById = userAddressService.getMallUserAddressById(addressId);
        UserAddressVO userAddressVO = new UserAddressVO();
        BeanUtils.copyProperties(mallUserAddressById, userAddressVO);
        if (!user.getUserId().equals(mallUserAddressById.getUserId())) {
            NewBeeException.fail(ServiceResultEnum.REQUEST_FORBIDEN_ERROR.getResult());
        }
        return ResultGenerator.genSuccessResult(userAddressVO);
    }

    @GetMapping("/address/default")
    @ApiOperation(value = "获取默认地址", notes = "无参")
    public Result<UserAddressVO> getMallUserAddressDefault(@TokenToMallUser User user){
        UserAddress myDefaultAddressByUserId = userAddressService.getMyDefaultAddressByUserId(user.getUserId());
        return ResultGenerator.genSuccessResult(myDefaultAddressByUserId);
    }
    @DeleteMapping("/address/{addressId}")
    @ApiOperation(value = "删除收货地址",notes = "地址id")
    public Result deleteAddress(@TokenToMallUser User user,
                                @PathVariable("addressId")Long addressId){
        UserAddress mallUserAddressById = userAddressService.getMallUserAddressById(addressId);
        if(!user.getUserId().equals(mallUserAddressById.getUserId())){
            NewBeeException.fail(ServiceResultEnum.REQUEST_FORBIDEN_ERROR.getResult());
        }
        Boolean result = userAddressService.deleteById(addressId);
        if(!result){
            ResultGenerator.genSuccessResult(ServiceResultEnum.OPERATE_ERROR.getResult());
        }
        return ResultGenerator.genSuccessResult();
    }
}
