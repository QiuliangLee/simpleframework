package com.imooc.service.solo.impl;

import com.imooc.entity.bo.ShopCategory;
import com.imooc.entity.dto.Result;
import com.imooc.service.solo.ShopCategoryService;
import org.simpleframework.core.annotation.Service;

import java.util.List;

@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {
    @Override
    public Result<Boolean> save(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<Boolean> remove(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<Boolean> update(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<ShopCategory> get(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<List<ShopCategory>> list(ShopCategory shopCategoryCondition, int pageIndex, int pageSize) {
        return null;
    }
}
