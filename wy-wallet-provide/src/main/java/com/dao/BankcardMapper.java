package com.dao;

import com.model.Bankcard;

public interface BankcardMapper {
    int insert(Bankcard record);

    int insertSelective(Bankcard record);

    Bankcard selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bankcard record);

    int updateByPrimaryKey(Bankcard record);
}