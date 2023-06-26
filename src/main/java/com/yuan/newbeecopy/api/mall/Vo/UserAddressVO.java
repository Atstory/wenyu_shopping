package com.yuan.newbeecopy.api.mall.Vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserAddressVO {
    @ApiModelProperty("地址id")
    private Long addressId;
    @ApiModelProperty("用户id")
    private Long userId;
    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("用户电话")
    private String userPhone;
    @ApiModelProperty("是否是默认地址 1-是 0-不是")
    private Byte defaultFlag;
    @ApiModelProperty("省")
    private String provinceName;
    @ApiModelProperty("市")
    private String cityName;
    @ApiModelProperty("区/县")
    private String regionName;
    @ApiModelProperty("详细地址")
    private String detailAddress;
}
