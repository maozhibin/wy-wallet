package com.dao;

import com.model.Collection;

public interface CollectionMapper {
    int insert(Collection record);

    int insertSelective(Collection record);

    Collection selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);
}