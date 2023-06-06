package com.yuan.newbeecopy.api.mall;

import com.yuan.newbeecopy.api.mall.param.UserLoginParam;
import com.yuan.newbeecopy.api.mall.param.UserRegisterParam;
import com.yuan.newbeecopy.api.mall.param.UserUpdateParam;
import com.yuan.newbeecopy.common.Constants;
import com.yuan.newbeecopy.common.ServiceResultEnum;
import com.yuan.newbeecopy.config.annotation.TokenToMallUser;
import com.yuan.newbeecopy.pojo.User;
import com.yuan.newbeecopy.service.MallUserService;
import com.yuan.newbeecopy.utils.NumberUtil;
import com.yuan.newbeecopy.utils.Result;
import com.yuan.newbeecopy.utils.ResultGenerator;
import com.yuan.newbeecopy.utils.SystemUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
@Api(value = "v1", tags = "2.新蜂商城用户操作相关接口")
public class PersonAPI {
    @Resource
    private MallUserService mallUserService;
    private static final Logger logger = LoggerFactory.getLogger(PersonAPI.class);
    @PostMapping("/user/login")
    @ApiOperation(value="登录接口",notes = "返回token")
    public Result<String> login(@RequestBody @Valid UserLoginParam userLogin){
        if(!NumberUtil.isPhone(userLogin.getUserName())){
            return ResultGenerator.genFailResult(ServiceResultEnum.LOGIN_NAME_IS_NOT_PHONE.getResult());
        }
        userLogin.setPasswordMd5(SystemUtil.genToken(userLogin.getPasswordMd5()));
        String loginResult = mallUserService.login(userLogin.getUserName(), userLogin.getPasswordMd5());
        logger.info("login api,loginName={},loginResult={}", userLogin.getUserName(), loginResult);
        //登录成功
        if(StringUtils.hasText(loginResult)&&loginResult.length()== Constants.TOKEN_LENGTH){
            Result result = ResultGenerator.genSuccessResult();
            result.setData(loginResult);
            return result;
        }
        return ResultGenerator.genFailResult(loginResult);
    }
    @PostMapping("/user/register")
    @ApiOperation(value = "用户注册",notes = "")
    public Result register(@RequestBody @Valid UserRegisterParam userRegisterParam){
        if(!NumberUtil.isPhone(userRegisterParam.getUserName())){
            return ResultGenerator.genFailResult(ServiceResultEnum.LOGIN_NAME_IS_NOT_PHONE.getResult());
        }
        String register = mallUserService.register(userRegisterParam.getUserName(), userRegisterParam.getPassword());
        logger.info("register api,loginName={},loginResult={}", userRegisterParam.getUserName(), userRegisterParam);
        //注册成功
        if(ServiceResultEnum.SUCCESS.getResult().equals(register)){
            return ResultGenerator.genSuccessResult();
        }
        //注册失败
        return ResultGenerator.genFailResult(register);
    }
    @PutMapping("/user/update")
    @ApiOperation(value = "用户修改",notes = "")
    public Result updateUserInfo(@RequestBody @ApiParam("用户信息") UserUpdateParam userUpdateParam, @TokenToMallUser User user){
        Boolean flag = mallUserService.userUpdateInfo(userUpdateParam, user.getUserId());
        if(flag){
            //返回成功
            return ResultGenerator.genSuccessResult("修改成功");
        }
        return ResultGenerator.genFailResult("修改失败");
    }
}
