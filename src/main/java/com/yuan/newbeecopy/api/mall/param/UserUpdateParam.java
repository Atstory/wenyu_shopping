package com.yuan.newbeecopy.api.mall.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserUpdateParam implements Serializable {
    @ApiModelProperty(value = "用户亲昵")
    private String nickName;
    @ApiModelProperty(value = "用户密码(需MD5加密)")
    private String password;
    @ApiModelProperty(value = "个性签名")
    private String introduceSign;
}
