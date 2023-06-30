package com.yuan.newbeecopy.api.mall;

import com.yuan.newbeecopy.api.mall.Vo.ShoppingCartItemVO;
import com.yuan.newbeecopy.api.mall.param.SaveCartItemParam;
import com.yuan.newbeecopy.api.mall.param.UpdateCartItemParam;
import com.yuan.newbeecopy.common.Constants;
import com.yuan.newbeecopy.common.NewBeeException;
import com.yuan.newbeecopy.common.ServiceResultEnum;
import com.yuan.newbeecopy.config.annotation.TokenToMallUser;
import com.yuan.newbeecopy.pojo.ShoppingCartItem;
import com.yuan.newbeecopy.pojo.User;
import com.yuan.newbeecopy.service.ShoppingCartService;
import com.yuan.newbeecopy.utils.PageQueryUtil;
import com.yuan.newbeecopy.utils.PageResult;
import com.yuan.newbeecopy.utils.Result;
import com.yuan.newbeecopy.utils.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(value = "v1", tags = "6.商城购物车接口")
@RequestMapping("/api/v1")
public class ShoppingCartAPI {
    @Resource
    private ShoppingCartService shoppingCartService;

    @GetMapping("/shop-cart/page")
    @ApiOperation(value = "购物车列表(每页默认5条)", notes = "传参为页码")
    public Result<PageResult<List<ShoppingCartItemVO>>> cartItemPageList(Integer pageNumber, @TokenToMallUser User user) {
        Map params = new HashMap(8);
        if (pageNumber == null || pageNumber < 1) {
            pageNumber = 1;
        }
        params.put("userId", user.getUserId());
        params.put("page", pageNumber);
        params.put("limit", Constants.SHOPPING_CART_PAGE_LIMIT);
        //封装分页请求数据
        PageQueryUtil pageQueryUtil = new PageQueryUtil(params);
        return ResultGenerator.genSuccessResult(shoppingCartService.getMyShoppingCartItems(pageQueryUtil));
    }

    @GetMapping("/shop-cart")
    @ApiOperation(value = "购物车列表(移动端不分页", notes = "")
    public Result<PageResult<List<ShoppingCartItemVO>>> cartItemList(@TokenToMallUser User user) {
        return ResultGenerator.genSuccessResult(shoppingCartService.getMyShoppingCartItems(user.getUserId()));
    }

    @PostMapping("/shop-cart")
    @ApiOperation(value = "添加商品到购物车", notes = "传参为商品id,数量")
    public Result saveShoppingCartItem(@RequestBody SaveCartItemParam saveCartItemParam,
                                       @TokenToMallUser User user) {
        String s = shoppingCartService.saveCartItem(saveCartItemParam, user.getUserId());
        //添加成功
        if (ServiceResultEnum.SUCCESS.getResult().equals(s)) {
            return ResultGenerator.genSuccessResult();
        }
        //添加失败
        return ResultGenerator.genFailResult(s);
    }

    @PutMapping("/shop-cart")
    @ApiOperation(value = "修改购物车", notes = "传参为商品id,数量")
    public Result updateShoppingCartItem(@RequestBody UpdateCartItemParam updateCartItemParam,
                                         @TokenToMallUser User user) {
        String s = shoppingCartService.updateCartItem(updateCartItemParam, user.getUserId());
        //修改成功
        if (ServiceResultEnum.SUCCESS.getResult().equals(s)) {
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genFailResult(s);
    }

    @DeleteMapping("/shop-cart/{cartId}")
    @ApiOperation(value = "删除购物车", notes = "传参为购物项id")
    public Result updateShoppingCartItem(@PathVariable("cartId") Long cartId,
                                         @TokenToMallUser User user) {
        ShoppingCartItem shoppingCartItemById = shoppingCartService.getShoppingCartItemById(cartId);
        if (!user.getUserId().equals(shoppingCartItemById.getUserId())) {
            return ResultGenerator.genFailResult(ServiceResultEnum.REQUEST_FORBIDEN_ERROR.getResult());
        }
        Boolean aBoolean = shoppingCartService.deleteById(cartId, user.getUserId());
        //删除成功
        if (aBoolean) {
            return ResultGenerator.genSuccessResult();
        }
        //删除失败
        return ResultGenerator.genFailResult(ServiceResultEnum.OPERATE_ERROR.getResult());
    }

    @GetMapping("/shop-cart/settle")
    @ApiOperation(value = "根据购物项id数组查询购物项明细", notes = "确认订单页面使用")
    public Result<List<ShoppingCartItemVO>> toSettle(Long[] cartItemIds,
                                                     @TokenToMallUser User user) {
        if (cartItemIds.length < 1) {
            NewBeeException.fail("参数异常");
        }
        int priceTotal = 0;
        List<ShoppingCartItemVO> cartItemForSettle = shoppingCartService.getCartItemForSettle(Arrays.asList(cartItemIds), user.getUserId());
        if (CollectionUtils.isEmpty(cartItemForSettle)) {
            NewBeeException.fail("参数异常");
        } else {
            //总价
            for (ShoppingCartItemVO item : cartItemForSettle) {
                priceTotal += item.getSellingPrice()* item.getGoodsCount();
            }
            if(priceTotal<1){
                NewBeeException.fail("价格异常");
            }
        }
        return ResultGenerator.genSuccessResult(cartItemForSettle);
    }
}
