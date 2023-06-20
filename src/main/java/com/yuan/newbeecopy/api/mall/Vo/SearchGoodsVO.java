package com.yuan.newbeecopy.api.mall.Vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class SearchGoodsVO implements Serializable {
    @ApiModelProperty("商品id")
    private Long goodsId;
    @ApiModelProperty("商品名称")
    private Long goodsName;
    @ApiModelProperty("商品简介")
    private Long goodsIntro;
    @ApiModelProperty("商品图片地址")
    private Long goodsCoverImg;
    @ApiModelProperty("商品价格")
    private Long sellingPrice;
    @ApiModelProperty("商品详情内容")
    private Long goodsDetailContent;
}
