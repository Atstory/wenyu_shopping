package com.yuan.newbeecopy.api.mall.Vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class IndexInfoVO implements Serializable {
    @ApiModelProperty("轮播图(列表)")
    private List<IndexCarouselVO> clusters;
    @ApiModelProperty("首页热销商品(列表)")
    private List<IndexConfigGoodsVO> hotGoodses;
    @ApiModelProperty("首页新品推荐(列表)")
    private List<IndexConfigGoodsVO> newGoodses;
    @ApiModelProperty("首页推荐商品(列表)")
    private List<IndexConfigGoodsVO> recommendGoodses;
}
