package com.yuan.newbeecopy.service;

import com.yuan.newbeecopy.api.mall.Vo.IndexConfigGoodsVO;

import java.util.List;

public interface IndexConfigService {
    List<IndexConfigGoodsVO> getConfigGoodsesForIndex(int configPage, int number);
}
