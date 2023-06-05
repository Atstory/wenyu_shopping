package com.yuan.newbeecopy.service.impl;

import com.yuan.newbeecopy.api.mall.Vo.IndexCarouselVO;
import com.yuan.newbeecopy.mapper.CarouselMapper;
import com.yuan.newbeecopy.pojo.Carousel;
import com.yuan.newbeecopy.service.CarouselService;
import com.yuan.newbeecopy.utils.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class CarouselServiceImpl implements CarouselService {
    @Resource
    private CarouselMapper carouselMapper;
    @Override
    public List<IndexCarouselVO> getCarouslsForIndex(int number) {
        List<IndexCarouselVO> indexCarouselVOS = new ArrayList<>(number);
        List<Carousel> carousels = carouselMapper.findCarouselsByNumber(number);
//        System.out.println("carousels = " + carousels);
        if(!CollectionUtils.isEmpty(carousels)){
            indexCarouselVOS = BeanUtil.copyList(carousels, IndexCarouselVO.class);
        }
        return indexCarouselVOS;
    }
}
