package com.yuan.newbeecopy.service;

import com.yuan.newbeecopy.api.mall.Vo.IndexCategoryVO;

import java.util.List;

public interface GoodsCategoryService {
    /**
     *首页调用分页数据
     * @return
     */
    List<IndexCategoryVO> getCategoryForIndex();
}
