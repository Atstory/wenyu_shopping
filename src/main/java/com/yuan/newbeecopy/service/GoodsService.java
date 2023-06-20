package com.yuan.newbeecopy.service;

import com.yuan.newbeecopy.pojo.GoodsInfo;
import com.yuan.newbeecopy.utils.PageQueryUtil;
import com.yuan.newbeecopy.utils.PageResult;

public interface GoodsService {
    /**
     * 获取商品分类数据
     * @param pageUtil
     * @return
     */
    PageResult getGoodsPage(PageQueryUtil pageUtil);

    /**
     * 按id查询商品
     * @param id
     * @return
     */
    GoodsInfo getGoodsInfoById(Long id);
}
