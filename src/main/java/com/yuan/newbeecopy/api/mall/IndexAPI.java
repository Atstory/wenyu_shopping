package com.yuan.newbeecopy.api.mall;

import com.yuan.newbeecopy.api.mall.Vo.IndexCarouselVO;
import com.yuan.newbeecopy.api.mall.Vo.IndexConfigGoodsVO;
import com.yuan.newbeecopy.api.mall.Vo.IndexInfoVO;
import com.yuan.newbeecopy.common.Constants;
import com.yuan.newbeecopy.common.IndexConfigTypeEnum;
import com.yuan.newbeecopy.config.annotation.TokenToAdminUser;
import com.yuan.newbeecopy.service.CarouselService;
import com.yuan.newbeecopy.service.IndexConfigService;
import com.yuan.newbeecopy.utils.Result;
import com.yuan.newbeecopy.utils.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(value = "v1", tags = "1.科技商城首页接口")
@RestController
@RequestMapping("/api/v1")
public class IndexAPI {

    @Resource
    private IndexConfigService indexConfigService;
    @Resource
    private CarouselService carouselService;
    @GetMapping ("/index-infos")
    @ApiOperation(value = "获取首页数据",notes = "轮播图、新品、推荐等")
    public Result<IndexInfoVO> indexInfo() {
        IndexInfoVO indexInfoVO = new IndexInfoVO();
        List<IndexCarouselVO> carousls = carouselService.getCarouslsForIndex(Constants.INDEX_CAROUSEL_NUMBER);
        List<IndexConfigGoodsVO> hotGoodses = indexConfigService.getConfigGoodsesForIndex(IndexConfigTypeEnum.INDEX_GOODS_HOT.getType(), Constants.INDEX_GOODS_HOT_NUMBER);
        List<IndexConfigGoodsVO> newGoodses = indexConfigService.getConfigGoodsesForIndex(IndexConfigTypeEnum.INDEX_GOODS_NEW.getType(), Constants.INDEX_GOODS_NEW_NUMBER);
        List<IndexConfigGoodsVO> recommendGoodses = indexConfigService.getConfigGoodsesForIndex(IndexConfigTypeEnum.INDEX_GOODS_RECOMMOND.getType(), Constants.INDEX_GOODS_RECOMMOND_NUMBER);
        indexInfoVO.setClusters(carousls);
        indexInfoVO.setHotGoodses(hotGoodses);
        indexInfoVO.setNewGoodses(newGoodses);
        indexInfoVO.setRecommendGoodses(recommendGoodses);
        return ResultGenerator.genSuccessResult(indexInfoVO);
    }
    @PostMapping("/test")
    @ApiOperation(value = "测试",notes = "测试")
    public String wdnmd(@RequestParam @TokenToAdminUser String wdnmd){
        System.out.println("wdnmd = " + wdnmd);
        return wdnmd;
    }
}
