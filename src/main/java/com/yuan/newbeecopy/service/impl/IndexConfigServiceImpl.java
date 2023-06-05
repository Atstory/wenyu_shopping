package com.yuan.newbeecopy.service.impl;

import com.yuan.newbeecopy.api.mall.Vo.IndexConfigGoodsVO;
import com.yuan.newbeecopy.mapper.GoodsInfoMapper;
import com.yuan.newbeecopy.mapper.IndexConfigMapper;
import com.yuan.newbeecopy.pojo.GoodsInfo;
import com.yuan.newbeecopy.pojo.IndexConfig;
import com.yuan.newbeecopy.service.IndexConfigService;
import com.yuan.newbeecopy.utils.BeanUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IndexConfigServiceImpl implements IndexConfigService {
    @Resource
    private IndexConfigMapper indexConfigMapper;
    @Resource
    private GoodsInfoMapper goodsInfoMapper;

    @Override
    public List<IndexConfigGoodsVO> getConfigGoodsesForIndex(int configPage, int number) {
        List<IndexConfigGoodsVO> indexConfigGoodsVOList = new ArrayList<>(number);
        List<IndexConfig> indexConfigsByTypeAndNum = indexConfigMapper.findIndexConfigsByTypeAndNum(configPage, number);
        if (!CollectionUtils.isEmpty(indexConfigsByTypeAndNum)) {
            List<Long> goodsIds = indexConfigsByTypeAndNum.stream().map(IndexConfig::getGoodsId).collect(Collectors.toList());
            List<GoodsInfo> goodsInfos = goodsInfoMapper.selectByPrimaryKeys(goodsIds);
            indexConfigGoodsVOList = BeanUtil.copyList(goodsInfos, IndexConfigGoodsVO.class);
//            for (IndexConfigGoodsVO indexConfigGoodsVO : goodsInfos) {
//                String goodsName = indexConfigGoodsVO.getGoodsName();
//                String goodsIntro = indexConfigGoodsVO.getGoodsIntro();
//                // 字符串过长导致文字超出的问题
//                if (goodsName.length() > 30) {
//                    goodsName = goodsName.substring(0, 30) + "...";
//                    indexConfigGoodsVO.setGoodsName(goodsName);
//                }
//                if (goodsIntro.length() > 22) {
//                    goodsIntro = goodsIntro.substring(0, 22) + "...";
//                    indexConfigGoodsVO.setGoodsIntro(goodsIntro);
//                }
//            }
        }
        return indexConfigGoodsVOList;
    }
}
