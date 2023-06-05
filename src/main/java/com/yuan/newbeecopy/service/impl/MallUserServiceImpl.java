package com.yuan.newbeecopy.service.impl;

import com.yuan.newbeecopy.common.ServiceResultEnum;
import com.yuan.newbeecopy.mapper.UserMapper;
import com.yuan.newbeecopy.mapper.UserTokenMapper;
import com.yuan.newbeecopy.pojo.User;
import com.yuan.newbeecopy.pojo.UserToken;
import com.yuan.newbeecopy.service.MallUserService;
import com.yuan.newbeecopy.utils.MD5Util;
import com.yuan.newbeecopy.utils.NumberUtil;
import com.yuan.newbeecopy.utils.SystemUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class MallUserServiceImpl implements MallUserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserTokenMapper userTokenMapper;

    @Override
    public String login(String userName, String password) {
        User user = userMapper.selectByLoginNameAndPasswd(userName, password);
        if (user != null) {
            if (user.getLockedFlag() == 1) {
                return ServiceResultEnum.LOGIN_USER_LOCKED_ERROR.getResult();
            }
            //登录后修改token操作
            String token = genNewToken(System.currentTimeMillis() + "", user.getUserId());
            UserToken userToken = userTokenMapper.selectByPrimaryKey(user.getUserId());
            //当前时间
            Date now = new Date();
            Date exDate = new Date(now.getTime() + 2 * 24 * 3600 * 1000);
            if (userToken == null) {
                userToken = new UserToken();
                userToken.setUserId(user.getUserId());
                userToken.setToken(token);
                userToken.setUpdateTime(now);
                userToken.setExpireTime(exDate);
                //新增一条token数据
                if (userTokenMapper.insertSelective(userToken) > 0) {
                    //更新成功后返回
                    return token;
                }
            } else {
                userToken.setToken(token);
                userToken.setUpdateTime(now);
                userToken.setExpireTime(exDate);
                if (userTokenMapper.updateByPrimaryKey(userToken) > 0) {
                    //修改成功后返回
                    return token;
                }
            }
        }
        return ServiceResultEnum.LOGIN_ERROR.getResult();
    }

    private String genNewToken(String timeStr, Long userId) {
        String src = timeStr + userId + NumberUtil.genRandomNum(4);
        return SystemUtil.genToken(src);
    }

    @Override
    public String register(String userName, String password) {
        if (userMapper.selectByLoginName(userName) != null) {
            return ServiceResultEnum.SAME_LOGIN_NAME_EXIST.getResult();
        }
        User user = new User();
        user.setLoginName(userName);
        user.setNickName(userName);
        user.setPasswordMd5(MD5Util.MD5Encode(password, "UTF-8"));
        if (userMapper.insertSelective(user) > 0) {
            return ServiceResultEnum.SUCCESS.getResult();
        }
        return ServiceResultEnum.DB_ERROR.getResult();
    }

    @Override
    public Boolean userUpdateInfo() {
        return null;
    }

    @Override
    public Boolean loginOut(Long userId) {
        return null;
    }

    @Override
    public Boolean lockUsers(Long[] ids, int lockStates) {
        return null;
    }
}
