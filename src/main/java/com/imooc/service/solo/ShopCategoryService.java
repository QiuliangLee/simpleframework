package com.imooc.service.solo;

import com.imooc.entity.bo.HeadLine;
import com.imooc.entity.bo.ShopCategory;
import com.imooc.entity.dto.Result;

import java.util.List;

public interface ShopCategoryService {
    Result<Boolean> save(ShopCategory shopCategory);

    Result<Boolean> remove(int shopCategoryId);

    Result<Boolean> update(ShopCategory shopCategory);

    Result<ShopCategory> get(int shopCategoryId);

    Result<List<ShopCategory>> list(ShopCategory shopCategoryCondition, int pageIndex, int pageSize);
}
