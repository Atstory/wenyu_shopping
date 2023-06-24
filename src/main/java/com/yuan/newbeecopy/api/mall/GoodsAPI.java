package com.yuan.newbeecopy.api.mall;

import com.yuan.newbeecopy.api.mall.Vo.GoodsDetailVO;
import com.yuan.newbeecopy.api.mall.Vo.SearchGoodsVO;
import com.yuan.newbeecopy.common.Constants;
import com.yuan.newbeecopy.common.NewBeeException;
import com.yuan.newbeecopy.common.ServiceResultEnum;
import com.yuan.newbeecopy.config.annotation.TokenToMallUser;
import com.yuan.newbeecopy.pojo.GoodsInfo;
import com.yuan.newbeecopy.pojo.User;
import com.yuan.newbeecopy.service.GoodsService;
import com.yuan.newbeecopy.utils.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(value = "v1", tags = "3.科技商品接口")
@RequestMapping("/api/v1")
public class GoodsAPI {
    @Resource
    private GoodsService goodsService;
    private static final Logger logger = LoggerFactory.getLogger(GoodsAPI.class);

    @GetMapping("/search")
    @ApiOperation(value = "商品搜索接口", notes = "根据关键字和分类id进行搜索")
    public Result<PageResult<List<SearchGoodsVO>>> search(@RequestParam(required = false) @ApiParam("关键词") String keyWord,
                                                          @RequestParam(required = false) @ApiParam("分类id") Long goodsCategoryId,
                                                          @RequestParam(required = false) @ApiParam("orderBy") String orderBy,
                                                          @RequestParam(required = false) @ApiParam("页码") Integer pageNumber,
                                                          @TokenToMallUser User user) {

        logger.info("goods search api,keyword={},goodsCategoryId={},orderBy={},pageNumber={},userId={}", keyWord, goodsCategoryId, orderBy, pageNumber, user.getUserId());
        Map params = new HashMap(8);
        if (goodsCategoryId == null && !StringUtils.hasText(keyWord)) {
            NewBeeException.fail("非法的参数");
        }
        if (pageNumber == null || pageNumber < 1) {
            pageNumber = 1;
        }
        params.put("goodsCategoryId", goodsCategoryId);
//        System.out.println("pageNumber = " + pageNumber);
        params.put("page", pageNumber);
        params.put("limit", Constants.ORDER_SEARCH_PAGE_LIMIT);
        //对空格过滤
        if (StringUtils.hasText(keyWord)) {
            params.put("keyWord", keyWord);
        }
        if (StringUtils.hasText(orderBy)) {
            params.put("orderBy", orderBy);
        }
        //搜索上架状态下的商品
        params.put("goodsSellStatus", Constants.SELL_STATUS_UP);
        //封装商品数据
        PageQueryUtil pageUtil = new PageQueryUtil(params);
        return ResultGenerator.genSuccessResult(goodsService.getGoodsPage(pageUtil));
    }

    @GetMapping("/goods/detail/{goodsId}")
    @ApiOperation(value = "商品详情接口", notes = "传参为商品id")
    public Result<GoodsDetailVO> goodsDetail(@ApiParam(value = "商品id") @PathVariable("goodsId") Long goodsId, @TokenToMallUser User user) {
        logger.info("goods detail api,goodsId={},userId={}", goodsId, user.getUserId());
        if (goodsId < 1) {
            return ResultGenerator.genFailResult("参数异常");
        }
        GoodsInfo goodsInfo = goodsService.getGoodsInfoById(goodsId);
        if (Constants.SELL_STATUS_UP != goodsInfo.getGoodsSellStatus()) {
            NewBeeException.fail(ServiceResultEnum.GOODS_PUT_DOWN.getResult());
        }
        GoodsDetailVO goodsDetailVO = new GoodsDetailVO();
        BeanUtil.copyProperties(goodsInfo,goodsDetailVO);
        goodsDetailVO.setGoodsCarouselList(goodsInfo.getGoodsCarousel().split(","));
        return ResultGenerator.genSuccessResult(goodsDetailVO);
    }
}
