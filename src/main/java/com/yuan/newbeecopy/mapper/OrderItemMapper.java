package com.yuan.newbeecopy.mapper;

import com.yuan.newbeecopy.pojo.OrderItem;
import com.yuan.newbeecopy.pojo.OrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    long countByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int deleteByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int deleteByPrimaryKey(Long orderItemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int insert(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int insertSelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    List<OrderItem> selectByExample(OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    OrderItem selectByPrimaryKey(Long orderItemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByPrimaryKey(OrderItem record);
}