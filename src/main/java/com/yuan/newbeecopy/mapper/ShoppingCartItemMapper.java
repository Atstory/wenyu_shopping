package com.yuan.newbeecopy.mapper;

import com.yuan.newbeecopy.api.mall.Vo.ShoppingCartItemVO;
import com.yuan.newbeecopy.pojo.ShoppingCartItem;
import com.yuan.newbeecopy.pojo.ShoppingCartItemExample;

import java.util.List;

import com.yuan.newbeecopy.utils.PageQueryUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface ShoppingCartItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_shopping_cart_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    long countByExample(ShoppingCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_shopping_cart_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int deleteByExample(ShoppingCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_shopping_cart_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int deleteByPrimaryKey(Long cartItemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_shopping_cart_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int insert(ShoppingCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_shopping_cart_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int insertSelective(ShoppingCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_shopping_cart_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    List<ShoppingCartItem> selectByExample(ShoppingCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_shopping_cart_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    ShoppingCartItem selectByPrimaryKey(Long cartItemId);

    List<ShoppingCartItem> selectByUserId(Long userId, int number);

    List<ShoppingCartItem> selectByUserIdAndCartItemIds(@PathVariable("userId") Long userId, @PathVariable("cartItemIds") List<Long> cartItemIds);

    List<ShoppingCartItem> findMyShoppingCartItems(PageQueryUtil pageUtil);

    ShoppingCartItem selectByUserIdAndGoodsId(@PathVariable("userId") Long userId, @PathVariable("goodsId") Long goodsId);

    int selectCountByUserId(@PathVariable("userId") Long userId);

    int getMyShoppingCartTotal(PageQueryUtil pageUtil);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_shopping_cart_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByExampleSelective(@Param("record") ShoppingCartItem record, @Param("example") ShoppingCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_shopping_cart_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByExample(@Param("record") ShoppingCartItem record, @Param("example") ShoppingCartItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_shopping_cart_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByPrimaryKeySelective(ShoppingCartItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_shopping_cart_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    int updateByPrimaryKey(ShoppingCartItem record);
}