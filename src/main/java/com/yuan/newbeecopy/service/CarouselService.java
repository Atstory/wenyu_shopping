package com.yuan.newbeecopy.service;

import com.yuan.newbeecopy.api.mall.Vo.IndexCarouselVO;

import java.util.List;

public interface CarouselService {
    /**
     *返回固定数量的轮播图(首页调用)
     * @param number
     * @return
     */
    List<IndexCarouselVO> getCarouslsForIndex(int number);
}
