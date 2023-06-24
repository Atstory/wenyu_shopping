package com.yuan.newbeecopy.api.mall;

import com.yuan.newbeecopy.api.mall.Vo.IndexCategoryVO;
import com.yuan.newbeecopy.common.NewBeeException;
import com.yuan.newbeecopy.common.ServiceResultEnum;
import com.yuan.newbeecopy.service.GoodsCategoryService;
import com.yuan.newbeecopy.utils.Result;
import com.yuan.newbeecopy.utils.ResultGenerator;
import io.swagger.annotations.Api;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "v1", tags = "4.科技商品分类接口")
@RequestMapping("/api/v1")
public class GoodsCategoryAPI {
    @Resource
    private GoodsCategoryService goodsCategoryService;
    @GetMapping("/categroies")
    public Result<List<IndexCategoryVO>> getCategroies(){
        List<IndexCategoryVO> categoryForIndex = goodsCategoryService.getCategoryForIndex();
        System.out.println("categoryForIndex = " + categoryForIndex);
        if(CollectionUtils.isEmpty(categoryForIndex)){
            NewBeeException.fail(ServiceResultEnum.DATA_NOT_EXIST.getResult());
        }
        return ResultGenerator.genSuccessResult(categoryForIndex);
    }
}
