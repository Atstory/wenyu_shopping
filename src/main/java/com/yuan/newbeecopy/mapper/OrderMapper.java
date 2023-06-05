package com.yuan.newbeecopy.mapper;

import com.yuan.newbeecopy.pojo.Order;
import com.yuan.newbeecopy.pojo.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    long countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int deleteByPrimaryKey(Long orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    Order selectByPrimaryKey(Long orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByPrimaryKey(Order record);
}