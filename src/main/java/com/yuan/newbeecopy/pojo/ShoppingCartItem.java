package com.yuan.newbeecopy.pojo;

import java.util.Date;

public class ShoppingCartItem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_shopping_cart_item.cart_item_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Long cartItemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_shopping_cart_item.user_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_shopping_cart_item.goods_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_shopping_cart_item.goods_count
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Integer goodsCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_shopping_cart_item.is_deleted
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Byte isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_shopping_cart_item.create_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_shopping_cart_item.update_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_shopping_cart_item.cart_item_id
     *
     * @return the value of tb_newbee_mall_shopping_cart_item.cart_item_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Long getCartItemId() {
        return cartItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_shopping_cart_item.cart_item_id
     *
     * @param cartItemId the value for tb_newbee_mall_shopping_cart_item.cart_item_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_shopping_cart_item.user_id
     *
     * @return the value of tb_newbee_mall_shopping_cart_item.user_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_shopping_cart_item.user_id
     *
     * @param userId the value for tb_newbee_mall_shopping_cart_item.user_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_shopping_cart_item.goods_id
     *
     * @return the value of tb_newbee_mall_shopping_cart_item.goods_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_shopping_cart_item.goods_id
     *
     * @param goodsId the value for tb_newbee_mall_shopping_cart_item.goods_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_shopping_cart_item.goods_count
     *
     * @return the value of tb_newbee_mall_shopping_cart_item.goods_count
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Integer getGoodsCount() {
        return goodsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_shopping_cart_item.goods_count
     *
     * @param goodsCount the value for tb_newbee_mall_shopping_cart_item.goods_count
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_shopping_cart_item.is_deleted
     *
     * @return the value of tb_newbee_mall_shopping_cart_item.is_deleted
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_shopping_cart_item.is_deleted
     *
     * @param isDeleted the value for tb_newbee_mall_shopping_cart_item.is_deleted
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_shopping_cart_item.create_time
     *
     * @return the value of tb_newbee_mall_shopping_cart_item.create_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_shopping_cart_item.create_time
     *
     * @param createTime the value for tb_newbee_mall_shopping_cart_item.create_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_shopping_cart_item.update_time
     *
     * @return the value of tb_newbee_mall_shopping_cart_item.update_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_shopping_cart_item.update_time
     *
     * @param updateTime the value for tb_newbee_mall_shopping_cart_item.update_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_shopping_cart_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cartItemId=").append(cartItemId);
        sb.append(", userId=").append(userId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsCount=").append(goodsCount);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}