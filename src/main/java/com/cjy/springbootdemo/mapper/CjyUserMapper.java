package com.cjy.springbootdemo.mapper;

import com.cjy.springbootdemo.entity.CjyUser;
import com.cjy.springbootdemo.entity.CjyUserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CjyUserMapper {
    long countByExample(CjyUserExample example);

    int deleteByExample(CjyUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(CjyUser record);

    int insertSelective(CjyUser record);

    List<CjyUser> selectByExample(CjyUserExample example);

    CjyUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") CjyUser record, @Param("example") CjyUserExample example);

    int updateByExample(@Param("record") CjyUser record, @Param("example") CjyUserExample example);

    int updateByPrimaryKeySelective(CjyUser record);

    int updateByPrimaryKey(CjyUser record);
}