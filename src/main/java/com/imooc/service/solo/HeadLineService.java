package com.imooc.service.solo;

import com.imooc.entity.bo.HeadLine;
import com.imooc.entity.dto.Result;

import java.util.List;

public interface HeadLineService {
    Result<Boolean> save(HeadLine headLine);

    Result<Boolean> remove(int headLineId);

    Result<Boolean> update(HeadLine headLine);

    Result<HeadLine> get(int headLineId);

    Result<List<HeadLine>> list(HeadLine headLineCondition, int pageIndex, int pageSize);
}
