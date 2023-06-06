package com.yuan.newbeecopy.config.handler;

import com.yuan.newbeecopy.common.Constants;
import com.yuan.newbeecopy.common.NewBeeException;
import com.yuan.newbeecopy.common.ServiceResultEnum;
import com.yuan.newbeecopy.config.annotation.TokenToAdminUser;
import com.yuan.newbeecopy.config.annotation.TokenToMallUser;
import com.yuan.newbeecopy.mapper.UserMapper;
import com.yuan.newbeecopy.mapper.UserTokenMapper;
import com.yuan.newbeecopy.pojo.User;
import com.yuan.newbeecopy.pojo.UserToken;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.annotation.Resource;
@Component
public class TokenToMallUserArgumentResovler implements HandlerMethodArgumentResolver {
    @Resource
    UserTokenMapper userTokenMapper;
    @Resource
    UserMapper userMapper;

    public TokenToMallUserArgumentResovler() {
    }

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        if (parameter.hasParameterAnnotation(TokenToMallUser.class)) return true;
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        if (parameter.getParameterAnnotation(TokenToMallUser.class) instanceof TokenToMallUser) {
            User mallUser = null;
            String token = webRequest.getHeader("token");
            if (token != null && !"".equals(token) && token.length() == Constants.TOKEN_LENGTH) {
                UserToken userToken = userTokenMapper.selectByToken(token);
                if (userToken == null || userToken.getExpireTime().getTime() <= System.currentTimeMillis()) {
                    NewBeeException.fail(ServiceResultEnum.TOKEN_EXPIRE_ERROR.getResult());
                }
                mallUser = userMapper.selectByPrimaryKey(userToken.getUserId());
                if (mallUser == null) {
                    NewBeeException.fail(ServiceResultEnum.USER_NULL_ERROR.getResult());
                }
                if (mallUser.getLockedFlag().intValue() == 1) {
                    NewBeeException.fail(ServiceResultEnum.LOGIN_USER_LOCKED_ERROR.getResult());
                }
                return mallUser;
            } else {
                NewBeeException.fail(ServiceResultEnum.ADMIN_NOT_LOGIN_ERROR.getResult());
            }
        }
        return null;
    }
}
