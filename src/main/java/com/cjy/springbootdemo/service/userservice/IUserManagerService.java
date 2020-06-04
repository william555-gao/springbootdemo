package com.cjy.springbootdemo.service.userservice;

import com.cjy.springbootdemo.entity.CjyUser;
import com.cjy.springbootdemo.entity.CjyUserExample;

import java.util.List;

/**
 *@Author:Gaoww
 *@Description:
 *@Date 11:26 2020/5/29
 *@Param
 *@return

 **/
public interface IUserManagerService {

    String userlogin(CjyUser user);

    String saveUser(CjyUser user);

    List<CjyUser> selectUsersByCondition(CjyUserExample userExample);

    CjyUser selectUserByPrimarykey(int primarykey);
}
