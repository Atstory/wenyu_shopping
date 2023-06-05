package com.yuan.newbeecopy.mapper;

import com.yuan.newbeecopy.pojo.GoodsCategory;
import com.yuan.newbeecopy.pojo.GoodsCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_goods_category
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    long countByExample(GoodsCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_goods_category
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int deleteByExample(GoodsCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_goods_category
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int deleteByPrimaryKey(Long categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_goods_category
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int insert(GoodsCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_goods_category
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int insertSelective(GoodsCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_goods_category
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    List<GoodsCategory> selectByExample(GoodsCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_goods_category
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    GoodsCategory selectByPrimaryKey(Long categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_goods_category
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByExampleSelective(@Param("record") GoodsCategory record, @Param("example") GoodsCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_goods_category
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByExample(@Param("record") GoodsCategory record, @Param("example") GoodsCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_goods_category
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByPrimaryKeySelective(GoodsCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_goods_category
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByPrimaryKey(GoodsCategory record);
}