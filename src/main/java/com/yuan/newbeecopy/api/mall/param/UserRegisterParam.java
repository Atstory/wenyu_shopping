package com.yuan.newbeecopy.api.mall.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserRegisterParam {
    @ApiModelProperty(value = "用户名")
    @NotEmpty(message = "用户名不能为空")
    private String userName;
    @ApiModelProperty(value = "密码")
    @NotEmpty(message = "密码不能为空")
    private String password;
}
