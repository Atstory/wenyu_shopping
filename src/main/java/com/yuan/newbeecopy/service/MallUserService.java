package com.yuan.newbeecopy.service;

public interface MallUserService {
    /**
     * 用户登录
     *
     * @param userName
     * @param password
     * @return
     */
    String login(String userName, String password);

    /**
     * 用户注册
     *
     * @param userName
     * @param password
     * @return
     */
    String register(String userName, String password);

    /**
     * 修改用户
     * @return
     */
    Boolean userUpdateInfo();

    /**
     * 用户登出
     * @param userId
     * @return
     */
    Boolean loginOut(Long userId);

    /**
     * 禁用用户
     * @param ids
     * @param lockStates
     * @return
     */
    Boolean lockUsers(Long[] ids, int lockStates);

}
