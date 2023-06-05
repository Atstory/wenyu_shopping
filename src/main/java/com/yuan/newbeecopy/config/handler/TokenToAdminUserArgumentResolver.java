package com.yuan.newbeecopy.config.handler;

import com.yuan.newbeecopy.common.Constants;
import com.yuan.newbeecopy.common.NewBeeException;
import com.yuan.newbeecopy.common.ServiceResultEnum;
import com.yuan.newbeecopy.config.annotation.TokenToAdminUser;
import com.yuan.newbeecopy.mapper.AdminUserTokenMapper;
import com.yuan.newbeecopy.pojo.AdminUserToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.annotation.Resource;

@Component
@Slf4j
public class TokenToAdminUserArgumentResolver implements HandlerMethodArgumentResolver {
    @Resource
    AdminUserTokenMapper adminUserTokenMapper;
    public TokenToAdminUserArgumentResolver() {
    }

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        if(parameter.hasParameterAnnotation(TokenToAdminUser.class))return true;
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        if(parameter.getParameterAnnotation(TokenToAdminUser.class) instanceof TokenToAdminUser){
            String token = webRequest.getHeader("token");
            if(token!=null&&!"".equals(token)&&token.length()== Constants.TOKEN_LENGTH){
                AdminUserToken adminUserToken = adminUserTokenMapper.selectByToken(token);
                if(adminUserToken==null){
                    NewBeeException.fail(ServiceResultEnum.ADMIN_TOKEN_EXPIRE_ERROR.getResult());
                }else if(adminUserToken.getExpireTime().getTime()>System.currentTimeMillis()){
                    NewBeeException.fail(ServiceResultEnum.ADMIN_TOKEN_EXPIRE_ERROR.getResult());
                }
                return adminUserToken;
            }else{
                NewBeeException.fail(ServiceResultEnum.ADMIN_NOT_LOGIN_ERROR.getResult());
            }
        }
        return null;
    }
}
