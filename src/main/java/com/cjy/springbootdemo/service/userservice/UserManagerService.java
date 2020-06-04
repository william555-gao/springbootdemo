package com.cjy.springbootdemo.service.userservice;

import com.cjy.springbootdemo.entity.CjyUser;
import com.cjy.springbootdemo.entity.CjyUserExample;
import com.cjy.springbootdemo.mapper.CjyUserMapper;
import com.cjy.springbootdemo.utils.AESEncryptUtil;
import com.cjy.springbootdemo.utils.CommonConstant;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 *@Author:Gaoww
 *@Description:
 *@Date 11:27 2020/5/29
 *@Param
 *@return

 **/
@Service
@Log4j2
public class UserManagerService implements IUserManagerService {

    @Resource
    private CjyUserMapper cjyUserMapper;



    @Override
    public String userlogin(CjyUser user) {
        CjyUser cjyUser = cjyUserMapper.selectByPrimaryKey(user.getUserId());
        String unEncryptPass = user.getUserPassword();
        if (AESEncryptUtil.encryptionStr(unEncryptPass).equals(cjyUser.getUserPassword())) {
            return CommonConstant.RETURN_KEY_SUCCESS;
        }
        return CommonConstant.RETURN_KEY_FAILED;
    }

    @Override
    public String saveUser(CjyUser user) {
        user.setCreateDate(new Date());
        user.setUpdateDate(new Date());
        user.setUserPassword(AESEncryptUtil.encryptionStr(user.getUserPassword()));
        int userId = cjyUserMapper.insertSelective(user);
        String result = "";
        if (userId > 0) {
            result = CommonConstant.RETURN_KEY_FAILED;
        }else{
            result = CommonConstant.RETURN_KEY_FAILED;
        }
        return result;
    }

    @Override
    public List<CjyUser> selectUsersByCondition(CjyUserExample userExample) {
        return cjyUserMapper.selectByExample(userExample);
    }

    @Override
    public CjyUser selectUserByPrimarykey(int primarykey) {
        return cjyUserMapper.selectByPrimaryKey(primarykey);
    }




}
