package com.yuan.newbeecopy.pojo;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_user.user_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_user.nick_name
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_user.login_name
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_user.password_md5
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private String passwordMd5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_user.introduce_sign
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private String introduceSign;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_user.is_deleted
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Byte isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_user.locked_flag
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Byte lockedFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_user.create_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_user.user_id
     *
     * @return the value of tb_newbee_mall_user.user_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_user.user_id
     *
     * @param userId the value for tb_newbee_mall_user.user_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_user.nick_name
     *
     * @return the value of tb_newbee_mall_user.nick_name
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_user.nick_name
     *
     * @param nickName the value for tb_newbee_mall_user.nick_name
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_user.login_name
     *
     * @return the value of tb_newbee_mall_user.login_name
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_user.login_name
     *
     * @param loginName the value for tb_newbee_mall_user.login_name
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_user.password_md5
     *
     * @return the value of tb_newbee_mall_user.password_md5
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public String getPasswordMd5() {
        return passwordMd5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_user.password_md5
     *
     * @param passwordMd5 the value for tb_newbee_mall_user.password_md5
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setPasswordMd5(String passwordMd5) {
        this.passwordMd5 = passwordMd5 == null ? null : passwordMd5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_user.introduce_sign
     *
     * @return the value of tb_newbee_mall_user.introduce_sign
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public String getIntroduceSign() {
        return introduceSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_user.introduce_sign
     *
     * @param introduceSign the value for tb_newbee_mall_user.introduce_sign
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setIntroduceSign(String introduceSign) {
        this.introduceSign = introduceSign == null ? null : introduceSign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_user.is_deleted
     *
     * @return the value of tb_newbee_mall_user.is_deleted
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_user.is_deleted
     *
     * @param isDeleted the value for tb_newbee_mall_user.is_deleted
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_user.locked_flag
     *
     * @return the value of tb_newbee_mall_user.locked_flag
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Byte getLockedFlag() {
        return lockedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_user.locked_flag
     *
     * @param lockedFlag the value for tb_newbee_mall_user.locked_flag
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setLockedFlag(Byte lockedFlag) {
        this.lockedFlag = lockedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_user.create_time
     *
     * @return the value of tb_newbee_mall_user.create_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_user.create_time
     *
     * @param createTime the value for tb_newbee_mall_user.create_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", nickName=").append(nickName);
        sb.append(", loginName=").append(loginName);
        sb.append(", passwordMd5=").append(passwordMd5);
        sb.append(", introduceSign=").append(introduceSign);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", lockedFlag=").append(lockedFlag);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}