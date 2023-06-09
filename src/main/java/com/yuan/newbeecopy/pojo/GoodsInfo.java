package com.yuan.newbeecopy.pojo;

import java.util.Date;

public class GoodsInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.goods_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.goods_name
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.goods_intro
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private String goodsIntro;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.goods_category_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Long goodsCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.goods_cover_img
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private String goodsCoverImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.goods_carousel
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private String goodsCarousel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.original_price
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Integer originalPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.selling_price
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Integer sellingPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.stock_num
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Integer stockNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.tag
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private String tag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.goods_sell_status
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Byte goodsSellStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.create_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Integer createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.create_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.update_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Integer updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.update_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_newbee_mall_goods_info.goods_detail_content
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    private String goodsDetailContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.goods_id
     *
     * @return the value of tb_newbee_mall_goods_info.goods_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.goods_id
     *
     * @param goodsId the value for tb_newbee_mall_goods_info.goods_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.goods_name
     *
     * @return the value of tb_newbee_mall_goods_info.goods_name
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.goods_name
     *
     * @param goodsName the value for tb_newbee_mall_goods_info.goods_name
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.goods_intro
     *
     * @return the value of tb_newbee_mall_goods_info.goods_intro
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public String getGoodsIntro() {
        return goodsIntro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.goods_intro
     *
     * @param goodsIntro the value for tb_newbee_mall_goods_info.goods_intro
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsIntro(String goodsIntro) {
        this.goodsIntro = goodsIntro == null ? null : goodsIntro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.goods_category_id
     *
     * @return the value of tb_newbee_mall_goods_info.goods_category_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Long getGoodsCategoryId() {
        return goodsCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.goods_category_id
     *
     * @param goodsCategoryId the value for tb_newbee_mall_goods_info.goods_category_id
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsCategoryId(Long goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.goods_cover_img
     *
     * @return the value of tb_newbee_mall_goods_info.goods_cover_img
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public String getGoodsCoverImg() {
        return goodsCoverImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.goods_cover_img
     *
     * @param goodsCoverImg the value for tb_newbee_mall_goods_info.goods_cover_img
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsCoverImg(String goodsCoverImg) {
        this.goodsCoverImg = goodsCoverImg == null ? null : goodsCoverImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.goods_carousel
     *
     * @return the value of tb_newbee_mall_goods_info.goods_carousel
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public String getGoodsCarousel() {
        return goodsCarousel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.goods_carousel
     *
     * @param goodsCarousel the value for tb_newbee_mall_goods_info.goods_carousel
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsCarousel(String goodsCarousel) {
        this.goodsCarousel = goodsCarousel == null ? null : goodsCarousel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.original_price
     *
     * @return the value of tb_newbee_mall_goods_info.original_price
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Integer getOriginalPrice() {
        return originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.original_price
     *
     * @param originalPrice the value for tb_newbee_mall_goods_info.original_price
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.selling_price
     *
     * @return the value of tb_newbee_mall_goods_info.selling_price
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Integer getSellingPrice() {
        return sellingPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.selling_price
     *
     * @param sellingPrice the value for tb_newbee_mall_goods_info.selling_price
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setSellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.stock_num
     *
     * @return the value of tb_newbee_mall_goods_info.stock_num
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Integer getStockNum() {
        return stockNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.stock_num
     *
     * @param stockNum the value for tb_newbee_mall_goods_info.stock_num
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.tag
     *
     * @return the value of tb_newbee_mall_goods_info.tag
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.tag
     *
     * @param tag the value for tb_newbee_mall_goods_info.tag
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.goods_sell_status
     *
     * @return the value of tb_newbee_mall_goods_info.goods_sell_status
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Byte getGoodsSellStatus() {
        return goodsSellStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.goods_sell_status
     *
     * @param goodsSellStatus the value for tb_newbee_mall_goods_info.goods_sell_status
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsSellStatus(Byte goodsSellStatus) {
        this.goodsSellStatus = goodsSellStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.create_user
     *
     * @return the value of tb_newbee_mall_goods_info.create_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.create_user
     *
     * @param createUser the value for tb_newbee_mall_goods_info.create_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.create_time
     *
     * @return the value of tb_newbee_mall_goods_info.create_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.create_time
     *
     * @param createTime the value for tb_newbee_mall_goods_info.create_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.update_user
     *
     * @return the value of tb_newbee_mall_goods_info.update_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.update_user
     *
     * @param updateUser the value for tb_newbee_mall_goods_info.update_user
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.update_time
     *
     * @return the value of tb_newbee_mall_goods_info.update_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.update_time
     *
     * @param updateTime the value for tb_newbee_mall_goods_info.update_time
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_newbee_mall_goods_info.goods_detail_content
     *
     * @return the value of tb_newbee_mall_goods_info.goods_detail_content
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public String getGoodsDetailContent() {
        return goodsDetailContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_newbee_mall_goods_info.goods_detail_content
     *
     * @param goodsDetailContent the value for tb_newbee_mall_goods_info.goods_detail_content
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    public void setGoodsDetailContent(String goodsDetailContent) {
        this.goodsDetailContent = goodsDetailContent == null ? null : goodsDetailContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_newbee_mall_goods_info
     *
     * @mbg.generated Sat Jun 03 19:30:03 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsIntro=").append(goodsIntro);
        sb.append(", goodsCategoryId=").append(goodsCategoryId);
        sb.append(", goodsCoverImg=").append(goodsCoverImg);
        sb.append(", goodsCarousel=").append(goodsCarousel);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", sellingPrice=").append(sellingPrice);
        sb.append(", stockNum=").append(stockNum);
        sb.append(", tag=").append(tag);
        sb.append(", goodsSellStatus=").append(goodsSellStatus);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", goodsDetailContent=").append(goodsDetailContent);
        sb.append("]");
        return sb.toString();
    }
}