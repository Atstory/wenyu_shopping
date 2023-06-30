package com.yuan.newbeecopy.service;

import com.yuan.newbeecopy.api.mall.Vo.ShoppingCartItemVO;
import com.yuan.newbeecopy.api.mall.param.SaveCartItemParam;
import com.yuan.newbeecopy.api.mall.param.UpdateCartItemParam;
import com.yuan.newbeecopy.pojo.ShoppingCartItem;
import com.yuan.newbeecopy.utils.PageQueryUtil;
import com.yuan.newbeecopy.utils.PageResult;

import java.util.List;

public interface ShoppingCartService {
    /**
     * 获取购物车信息
     * @param pageUtil
     * @return
     */
    PageResult getMyShoppingCartItems(PageQueryUtil pageUtil);

    /**
     *获取购物车列表数据
     * @param userId
     * @return
     */
    List<ShoppingCartItemVO> getMyShoppingCartItems(Long  userId);

    /**
     * 删除购物项
     * @param shoppingCartItemId
     * @param userId
     * @return
     */
    Boolean deleteById(Long shoppingCartItemId,Long userId);
    /**
     * 获取购物车详情
     * @param cartId
     * @return
     */
    ShoppingCartItem getShoppingCartItemById(Long cartId);
    /**
     * 保存商品到购物车中
     * @param saveCartItemParam
     * @param userId
     * @return
     */
    String saveCartItem(SaveCartItemParam saveCartItemParam,Long userId);

    /**
     * 修改商品
     * @param updateCartItemParam
     * @param userId
     * @return
     */
    String updateCartItem(UpdateCartItemParam updateCartItemParam, Long userId);

    /**
     * 根据userId和cartItemId项查询购物项记录
     * @param cartItemIds
     * @param userId
     * @return
     */
    List<ShoppingCartItemVO> getCartItemForSettle(List<Long> cartItemIds,Long userId);
}
