package com.springbootdemo.mapper;

import com.springbootdemo.entity.CjyAuthority;
import com.springbootdemo.entity.CjyAuthorityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CjyAuthorityMapper {
    long countByExample(CjyAuthorityExample example);

    int deleteByExample(CjyAuthorityExample example);

    int deleteByPrimaryKey(Integer authorityId);

    int insert(CjyAuthority record);

    int insertSelective(CjyAuthority record);

    List<CjyAuthority> selectByExample(CjyAuthorityExample example);

    CjyAuthority selectByPrimaryKey(Integer authorityId);

    int updateByExampleSelective(@Param("record") CjyAuthority record, @Param("example") CjyAuthorityExample example);

    int updateByExample(@Param("record") CjyAuthority record, @Param("example") CjyAuthorityExample example);

    int updateByPrimaryKeySelective(CjyAuthority record);

    int updateByPrimaryKey(CjyAuthority record);
}