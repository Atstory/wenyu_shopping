package com.yuan.newbeecopy.pojo;

import java.util.Date;

public class OrderItem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_order_item.order_item_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Long orderItemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_order_item.order_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_order_item.goods_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_order_item.goods_name
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_order_item.goods_cover_img
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private String goodsCoverImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_order_item.selling_price
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Integer sellingPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_order_item.goods_count
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Integer goodsCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_order_item.create_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_order_item.order_item_id
     *
     * @return the value of tb_newbee_mall_order_item.order_item_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Long getOrderItemId() {
        return orderItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_order_item.order_item_id
     *
     * @param orderItemId the value for tb_newbee_mall_order_item.order_item_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_order_item.order_id
     *
     * @return the value of tb_newbee_mall_order_item.order_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_order_item.order_id
     *
     * @param orderId the value for tb_newbee_mall_order_item.order_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_order_item.goods_id
     *
     * @return the value of tb_newbee_mall_order_item.goods_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_order_item.goods_id
     *
     * @param goodsId the value for tb_newbee_mall_order_item.goods_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_order_item.goods_name
     *
     * @return the value of tb_newbee_mall_order_item.goods_name
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_order_item.goods_name
     *
     * @param goodsName the value for tb_newbee_mall_order_item.goods_name
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_order_item.goods_cover_img
     *
     * @return the value of tb_newbee_mall_order_item.goods_cover_img
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public String getGoodsCoverImg() {
        return goodsCoverImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_order_item.goods_cover_img
     *
     * @param goodsCoverImg the value for tb_newbee_mall_order_item.goods_cover_img
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsCoverImg(String goodsCoverImg) {
        this.goodsCoverImg = goodsCoverImg == null ? null : goodsCoverImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_order_item.selling_price
     *
     * @return the value of tb_newbee_mall_order_item.selling_price
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Integer getSellingPrice() {
        return sellingPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_order_item.selling_price
     *
     * @param sellingPrice the value for tb_newbee_mall_order_item.selling_price
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setSellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_order_item.goods_count
     *
     * @return the value of tb_newbee_mall_order_item.goods_count
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Integer getGoodsCount() {
        return goodsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_order_item.goods_count
     *
     * @param goodsCount the value for tb_newbee_mall_order_item.goods_count
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_order_item.create_time
     *
     * @return the value of tb_newbee_mall_order_item.create_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_order_item.create_time
     *
     * @param createTime the value for tb_newbee_mall_order_item.create_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_order_item
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderItemId=").append(orderItemId);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsCoverImg=").append(goodsCoverImg);
        sb.append(", sellingPrice=").append(sellingPrice);
        sb.append(", goodsCount=").append(goodsCount);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}