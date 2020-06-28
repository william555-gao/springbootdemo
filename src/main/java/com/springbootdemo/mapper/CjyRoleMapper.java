package com.springbootdemo.mapper;

import com.springbootdemo.entity.CjyRole;
import com.springbootdemo.entity.CjyRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CjyRoleMapper {
    long countByExample(CjyRoleExample example);

    int deleteByExample(CjyRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(CjyRole record);

    int insertSelective(CjyRole record);

    List<CjyRole> selectByExample(CjyRoleExample example);

    CjyRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") CjyRole record, @Param("example") CjyRoleExample example);

    int updateByExample(@Param("record") CjyRole record, @Param("example") CjyRoleExample example);

    int updateByPrimaryKeySelective(CjyRole record);

    int updateByPrimaryKey(CjyRole record);
}