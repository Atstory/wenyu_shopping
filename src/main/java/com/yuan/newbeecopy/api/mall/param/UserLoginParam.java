package com.yuan.newbeecopy.api.mall.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class UserLoginParam implements Serializable {
    @ApiModelProperty("用户名")
    @NotEmpty(message = "需要用户名")
    private String userName;
    @ApiModelProperty("用户密码(需要MD5加密)")
    @NotEmpty(message = "密码")
    private String passwordMd5;
}
