package com.cjy.springbootdemo.mapper;

import com.cjy.springbootdemo.entity.CjyRoleAuthorityExample;
import com.cjy.springbootdemo.entity.CjyRoleAuthorityKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CjyRoleAuthorityMapper {
    long countByExample(CjyRoleAuthorityExample example);

    int deleteByExample(CjyRoleAuthorityExample example);

    int deleteByPrimaryKey(CjyRoleAuthorityKey key);

    int insert(CjyRoleAuthorityKey record);

    int insertSelective(CjyRoleAuthorityKey record);

    List<CjyRoleAuthorityKey> selectByExample(CjyRoleAuthorityExample example);

    int updateByExampleSelective(@Param("record") CjyRoleAuthorityKey record, @Param("example") CjyRoleAuthorityExample example);

    int updateByExample(@Param("record") CjyRoleAuthorityKey record, @Param("example") CjyRoleAuthorityExample example);
}