package com.yuan.newbeecopy.service.impl;

import com.yuan.newbeecopy.common.NewBeeException;
import com.yuan.newbeecopy.common.ServiceResultEnum;
import com.yuan.newbeecopy.mapper.GoodsInfoMapper;
import com.yuan.newbeecopy.pojo.GoodsInfo;
import com.yuan.newbeecopy.service.GoodsService;
import com.yuan.newbeecopy.utils.PageQueryUtil;
import com.yuan.newbeecopy.utils.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsInfoMapper goodsInfoMapper;
    @Override
    public PageResult getGoodsPage(PageQueryUtil pageUtil) {
        List<GoodsInfo> goodsList = goodsInfoMapper.findGoodsListBySearch(pageUtil);
        int total =goodsInfoMapper.getTotalGoods(pageUtil);
        PageResult result = new PageResult(goodsList,total, pageUtil.getLimit(), pageUtil.getCurrPage());
        return result;
    }

    @Override
    public GoodsInfo getGoodsInfoById(Long id) {
        GoodsInfo goodsInfo = goodsInfoMapper.selectByPrimaryKey(id);
        if(goodsInfo==null){
            NewBeeException.fail(ServiceResultEnum.GOODS_NOT_EXIST.getResult());
        }
        return goodsInfo;
    }
}
