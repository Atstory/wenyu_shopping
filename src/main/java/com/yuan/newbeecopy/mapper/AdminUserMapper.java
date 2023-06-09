package com.yuan.newbeecopy.mapper;

import com.yuan.newbeecopy.pojo.AdminUser;
import com.yuan.newbeecopy.pojo.AdminUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_admin_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    long countByExample(AdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_admin_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int deleteByExample(AdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_admin_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int deleteByPrimaryKey(Long adminUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_admin_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int insert(AdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_admin_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int insertSelective(AdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_admin_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    List<AdminUser> selectByExample(AdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_admin_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    AdminUser selectByPrimaryKey(Long adminUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_admin_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByExampleSelective(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_admin_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByExample(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_admin_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByPrimaryKeySelective(AdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_admin_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByPrimaryKey(AdminUser record);
}