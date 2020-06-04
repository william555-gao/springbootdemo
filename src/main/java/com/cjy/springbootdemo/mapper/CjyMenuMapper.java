package com.cjy.springbootdemo.mapper;

import com.cjy.springbootdemo.entity.CjyMenu;
import com.cjy.springbootdemo.entity.CjyMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CjyMenuMapper {
    long countByExample(CjyMenuExample example);

    int deleteByExample(CjyMenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(CjyMenu record);

    int insertSelective(CjyMenu record);

    List<CjyMenu> selectByExample(CjyMenuExample example);

    CjyMenu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") CjyMenu record, @Param("example") CjyMenuExample example);

    int updateByExample(@Param("record") CjyMenu record, @Param("example") CjyMenuExample example);

    int updateByPrimaryKeySelective(CjyMenu record);

    int updateByPrimaryKey(CjyMenu record);
}