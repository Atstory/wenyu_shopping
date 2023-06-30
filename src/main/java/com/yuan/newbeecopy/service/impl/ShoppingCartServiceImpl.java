package com.yuan.newbeecopy.service.impl;

import com.yuan.newbeecopy.api.mall.Vo.ShoppingCartItemVO;
import com.yuan.newbeecopy.api.mall.param.SaveCartItemParam;
import com.yuan.newbeecopy.api.mall.param.UpdateCartItemParam;
import com.yuan.newbeecopy.common.Constants;
import com.yuan.newbeecopy.common.NewBeeException;
import com.yuan.newbeecopy.common.ServiceResultEnum;
import com.yuan.newbeecopy.mapper.GoodsInfoMapper;
import com.yuan.newbeecopy.mapper.ShoppingCartItemMapper;
import com.yuan.newbeecopy.pojo.GoodsInfo;
import com.yuan.newbeecopy.pojo.ShoppingCartItem;
import com.yuan.newbeecopy.service.ShoppingCartService;
import com.yuan.newbeecopy.utils.BeanUtil;
import com.yuan.newbeecopy.utils.PageQueryUtil;
import com.yuan.newbeecopy.utils.PageResult;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Resource
    private ShoppingCartItemMapper shoppingItemMapper;
    @Resource
    private GoodsInfoMapper goodsInfoMapper;

    @Override
    public PageResult getMyShoppingCartItems(PageQueryUtil pageUtil) {
        List<ShoppingCartItemVO> shoppingItemList = new ArrayList<>();
        List<ShoppingCartItem> myShoppingCartItems = shoppingItemMapper.findMyShoppingCartItems(pageUtil);
        int total = shoppingItemMapper.getMyShoppingCartTotal(pageUtil);
        PageResult pageResult = new PageResult(getShoppingCartItemVOS(shoppingItemList, myShoppingCartItems), total, pageUtil.getLimit(), pageUtil.getCurrPage());
        return pageResult;
    }

    @Override
    public List<ShoppingCartItemVO> getMyShoppingCartItems(Long userId) {
        List<ShoppingCartItemVO> shoppingCartItemVOS = new ArrayList<>();
        List<ShoppingCartItem> shoppingCartItem = shoppingItemMapper.selectByUserId(userId, Constants.SHOPPING_CART_ITEM_TOTAL_NUMBER);
        return getShoppingCartItemVOS(shoppingCartItemVOS, shoppingCartItem);
    }

    @Override
    public Boolean deleteById(Long shoppingCartItemId, Long userId) {
        ShoppingCartItem shoppingCartItem = shoppingItemMapper.selectByPrimaryKey(shoppingCartItemId);
        if (shoppingCartItem == null) {
            return false;
        }
        if (!shoppingCartItem.getUserId().equals(userId)) {
            return false;
        }
        return shoppingItemMapper.deleteByPrimaryKey(shoppingCartItemId) > 0;
    }

    @Override
    public ShoppingCartItem getShoppingCartItemById(Long cartId) {
        ShoppingCartItem shoppingCartItem = shoppingItemMapper.selectByPrimaryKey(cartId);
        if (shoppingCartItem == null) {
            NewBeeException.fail(ServiceResultEnum.DATA_NOT_EXIST.getResult());
        }
        return shoppingCartItem;
    }

    @Override
    public String saveCartItem(SaveCartItemParam saveCartItemParam, Long userId) {
        ShoppingCartItem temp = shoppingItemMapper.selectByUserIdAndGoodsId(userId, saveCartItemParam.getGoodsId());
        if (temp != null) {
            //已存在则修改该记录
            NewBeeException.fail(ServiceResultEnum.SHOPPING_CART_ITEM_EXIST_ERROR.getResult());
        }
        GoodsInfo goodsInfo = goodsInfoMapper.selectByPrimaryKey(saveCartItemParam.getGoodsId());
        if (goodsInfo == null) {
            return ServiceResultEnum.GOODS_NOT_EXIST.getResult();
        }
        int totalItem = shoppingItemMapper.selectCountByUserId(userId);
        //超出单个商品的最大数量
        if (saveCartItemParam.getGoodsCount() < 1) {
            return ServiceResultEnum.SHOPPING_CART_ITEM_NUMBER_ERROR.getResult();
        }
        //超出单个商品的最大数量
        if (saveCartItemParam.getGoodsCount() > Constants.SHOPPING_CART_ITEM_TOTAL_NUMBER) {
            return ServiceResultEnum.SHOPPING_CART_ITEM_TOTAL_NUMBER_ERROR.getResult();
        }
        //超出最大容量
        if (totalItem > Constants.SHOPPING_CART_ITEM_LIMIT_NUMBER) {
            return ServiceResultEnum.SHOPPING_CART_ITEM_TOTAL_NUMBER_ERROR.getResult();
        }
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
        BeanUtil.copyProperties(saveCartItemParam, shoppingCartItem);
        shoppingCartItem.setUserId(userId);
        //保存记录
        if (shoppingItemMapper.insertSelective(shoppingCartItem) > 0) {
            return ServiceResultEnum.SUCCESS.getResult();
        }
        return ServiceResultEnum.DB_ERROR.getResult();
    }

    @Override
    public String updateCartItem(UpdateCartItemParam updateCartItemParam, Long userId) {
        ShoppingCartItem shoppingCartItem = shoppingItemMapper.selectByPrimaryKey(updateCartItemParam.getCartItemId());
        if (shoppingCartItem == null) {
            return ServiceResultEnum.DATA_NOT_EXIST.getResult();
        }
        if (!shoppingCartItem.getUserId().equals(userId)) {
            NewBeeException.fail(ServiceResultEnum.REQUEST_FORBIDEN_ERROR.getResult());
        }
        //超出单个商品的最大数量
        if (updateCartItemParam.getGoodsCount() > Constants.SHOPPING_CART_ITEM_TOTAL_NUMBER) {
            return ServiceResultEnum.SHOPPING_CART_ITEM_TOTAL_NUMBER_ERROR.getResult();
        }
        //当前登录账号的userId与待修改的cartItem中userId不同，返回错误
        if (!shoppingCartItem.getUserId().equals(userId)) {
            return ServiceResultEnum.NO_PERMISSION_ERROR.getResult();
        }
        //数据相同不执行操作
        if (updateCartItemParam.getGoodsCount().equals(shoppingCartItem.getGoodsCount())) {
            return ServiceResultEnum.SUCCESS.getResult();
        }
        shoppingCartItem.setGoodsCount(updateCartItemParam.getGoodsCount());
        shoppingCartItem.setUpdateTime(new Date());
        //修改记录
        if (shoppingItemMapper.updateByPrimaryKeySelective(shoppingCartItem) > 0) {
            return ServiceResultEnum.SUCCESS.getResult();
        }
        return ServiceResultEnum.DB_ERROR.getResult();
    }

    @Override
    public List<ShoppingCartItemVO> getCartItemForSettle(List<Long> cartItemIds, Long userId) {
        List<ShoppingCartItemVO> shoppingCartItemVOS = new ArrayList<>();
        if (CollectionUtils.isEmpty(cartItemIds)) {
            NewBeeException.fail("购物项不能为空");
        }
        List<ShoppingCartItem> shoppingCartItems = shoppingItemMapper.selectByUserIdAndCartItemIds(userId, cartItemIds);
        if (CollectionUtils.isEmpty(shoppingCartItems)) {
            NewBeeException.fail("购物项不能为空");
        }
        if(shoppingCartItems.size()!=cartItemIds.size()){
            NewBeeException.fail("参数异常");
        }
        return getShoppingCartItemVOS(shoppingCartItemVOS,shoppingCartItems);
    }

    private List<ShoppingCartItemVO> getShoppingCartItemVOS(List<ShoppingCartItemVO> shoppingCartItemVOS, List<ShoppingCartItem> shoppingCartItems) {
        if (!CollectionUtils.isEmpty(shoppingCartItems)) {
            //查询商品数据转换
            List<Long> goodsIds = shoppingCartItems.stream().map(ShoppingCartItem::getGoodsId).collect(Collectors.toList());
            List<GoodsInfo> goodsInfoList = goodsInfoMapper.selectByPrimaryKeys(goodsIds);
            Map<Long, GoodsInfo> goodsInfoMap = new HashMap<>();
            if (!CollectionUtils.isEmpty(goodsInfoList)) {
                goodsInfoMap = goodsInfoList.stream().collect(Collectors.toMap(GoodsInfo::getGoodsId, Function.identity(), (entity1, entity2) -> (entity1)));
            }
            for (ShoppingCartItem shoppingItem : shoppingCartItems) {
                ShoppingCartItemVO shoppingCartItemVO = new ShoppingCartItemVO();
                BeanUtils.copyProperties(shoppingItem, shoppingCartItemVO);
                if (goodsInfoMap.containsKey(shoppingItem.getGoodsId())) {
                    GoodsInfo goodsInfoTemp = goodsInfoMap.get(shoppingItem.getGoodsId());
                    shoppingCartItemVO.setGoodsCoverImg(goodsInfoTemp.getGoodsCoverImg());
                    String goodsName = goodsInfoTemp.getGoodsName();
                    if (goodsName.length() > 28) {
                        goodsName = goodsName.substring(0, 28) + "";
                    }
                    shoppingCartItemVO.setGoodsName(goodsName);
                    shoppingCartItemVO.setSellingPrice(goodsInfoTemp.getSellingPrice());
                    shoppingCartItemVOS.add(shoppingCartItemVO);
                }
            }
        }
        return shoppingCartItemVOS;
    }
}
