package com.dao;

import com.model.RoleAdmin;

public interface RoleAdminMapper {
    int insert(RoleAdmin record);

    int insertSelective(RoleAdmin record);

    RoleAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleAdmin record);

    int updateByPrimaryKey(RoleAdmin record);
}