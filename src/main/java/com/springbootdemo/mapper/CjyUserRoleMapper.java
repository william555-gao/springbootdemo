package com.springbootdemo.mapper;

import com.springbootdemo.entity.CjyUserRoleExample;
import com.springbootdemo.entity.CjyUserRoleKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CjyUserRoleMapper {
    long countByExample(CjyUserRoleExample example);

    int deleteByExample(CjyUserRoleExample example);

    int deleteByPrimaryKey(CjyUserRoleKey key);

    int insert(CjyUserRoleKey record);

    int insertSelective(CjyUserRoleKey record);

    List<CjyUserRoleKey> selectByExample(CjyUserRoleExample example);

    int updateByExampleSelective(@Param("record") CjyUserRoleKey record, @Param("example") CjyUserRoleExample example);

    int updateByExample(@Param("record") CjyUserRoleKey record, @Param("example") CjyUserRoleExample example);
}