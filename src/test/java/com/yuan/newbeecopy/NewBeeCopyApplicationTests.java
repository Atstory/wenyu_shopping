package com.yuan.newbeecopy;

import com.yuan.newbeecopy.api.mall.Vo.IndexCarouselVO;
import com.yuan.newbeecopy.api.mall.Vo.IndexCategoryVO;
import com.yuan.newbeecopy.api.mall.Vo.IndexConfigGoodsVO;
import com.yuan.newbeecopy.mapper.GoodsCategoryMapper;
import com.yuan.newbeecopy.pojo.GoodsCategory;
import com.yuan.newbeecopy.pojo.GoodsCategoryExample;
import com.yuan.newbeecopy.service.CarouselService;
import com.yuan.newbeecopy.service.GoodsCategoryService;
import com.yuan.newbeecopy.service.IndexConfigService;
import com.yuan.newbeecopy.utils.MD5Util;
import com.yuan.newbeecopy.utils.NumberUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;

@SpringBootTest
@Slf4j
class NewBeeCopyApplicationTests {
    @Resource
    GoodsCategoryService goodsCategoryService;

    @Test
    void contextLoads() {
//        List<GoodsCategory> userAddresses = goodsCategoryMapper.selectByPrimaryKey(null);
//        userAddresses.forEach((item)->{
//            log.info("查询结果-->{}",item.getCategoryName());
//        });
//        List<GoodsCategory> goodsCategories = goodsCategoryMapper.selectByExample(new GoodsCategoryExample());
//        goodsCategories.forEach((item) -> {
//            log.info("查询结果-->{}", item.toString());
//        });
//        List<IndexCarouselVO> carouslsForIndex = carouselService.getCarouslsForIndex(5);
//        List<IndexConfigGoodsVO> index_goods_hots = indexConfigService.getConfigGoodsesForIndex(3, 20);
//        index_goods_hots.forEach((item) -> {
//            log.info("查询结果-->{}", item.toString());
//        });
//        String wdnmd = "123456";
//        try {
//            byte[] bytes = wdnmd.getBytes("UTF-8");
//            for (byte b: bytes) {
//                System.out.println("b = " + b);
//            }
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(Collections.singletonList(0L));
//        System.out.println("b/16 = " + MD5Util.MD5Encode(wdnmd,"UTF-8"));
//        for (IndexCategoryVO categoryForIndex : goodsCategoryService.getCategoryForIndex()) {
//            System.out.println("categoryForIndex = " + categoryForIndex);
//        }

    }
}
