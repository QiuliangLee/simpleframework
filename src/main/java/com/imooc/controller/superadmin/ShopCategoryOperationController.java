package com.imooc.controller.superadmin;

import com.imooc.entity.bo.ShopCategory;
import com.imooc.entity.dto.Result;
import com.imooc.service.solo.ShopCategoryService;
import org.simpleframework.core.annotation.Controller;
import org.simpleframework.inject.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ShopCategoryOperationController {
    @Autowired
    private ShopCategoryService shopCategoryService;

    public Result<Boolean> addShopCategory(HttpServletRequest req, HttpServletResponse resp) {
        //TODO:参数校验以及请求参数转化
        return shopCategoryService.save(new ShopCategory());
    }

    public Result<Boolean> removeShopCategory(HttpServletRequest req, HttpServletResponse resp) {
        //TODO:参数校验以及请求参数转化
        return shopCategoryService.remove(1);
    }

    public Result<Boolean> modifyShopCategory(HttpServletRequest req, HttpServletResponse resp) {
        //TODO:参数校验以及请求参数转化
        return shopCategoryService.update(new ShopCategory());
    }

    public Result<ShopCategory> queryShopCategoryById(HttpServletRequest req, HttpServletResponse resp) {
        //TODO:参数校验以及请求参数转化
        return shopCategoryService.get(1);
    }

    public Result<List<ShopCategory>> queryShopCategory(HttpServletRequest req, HttpServletResponse resp) {
        //TODO:参数校验以及请求参数转化
        return shopCategoryService.list(null, 1, 100);
    }
}
