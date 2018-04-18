package com.dao;

import com.model.OperateRecords;

public interface OperateRecordsMapper {
    int insert(OperateRecords record);

    int insertSelective(OperateRecords record);

    OperateRecords selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OperateRecords record);

    int updateByPrimaryKey(OperateRecords record);
}