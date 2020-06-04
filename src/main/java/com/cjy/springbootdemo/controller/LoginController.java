package com.cjy.springbootdemo.controller;

import com.cjy.springbootdemo.entity.BaseResponse;
import com.cjy.springbootdemo.entity.CjyUser;
import com.cjy.springbootdemo.service.userservice.IUserManagerService;
import com.cjy.springbootdemo.utils.CommonConstant;
import com.cjy.springbootdemo.utils.Util;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName:LoginController
 * @Descirpiton: TODO
 * @Author: Gaoww
 * @Date: 2020/5/29 16:45
 * @Version: 1.0
 */
@RestController
@Log4j2
@RequestMapping(value = "/cjy")
public class LoginController {

    @Resource
    private IUserManagerService userDetailService;

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public BaseResponse<CjyUser> login(@RequestBody CjyUser cjyUser){
        String loginStatus = userDetailService.userlogin(cjyUser);
        BaseResponse<CjyUser> br = new BaseResponse<>();

        if (CommonConstant.RETURN_KEY_SUCCESS.equals(loginStatus)) {
            log.info("当前登录用户:"+cjyUser.getUserName()+"; 登录时间:"+ Util.getTimeString("yyyy-MM-dd HH:mm:ss"));
            br.setResultMark(CommonConstant.RETURN_KEY_SUCCESS);
            br.setResultStatusNum(CommonConstant.RETURN_SUCCESS_STATUS_NUM);
            br.setResultStr(CommonConstant.SAVE_USER_SUCCESS);
        }else{
            br.setResultMark(CommonConstant.RETURN_KEY_FAILED);
            br.setResultStatusNum(CommonConstant.RETURN_FAILED_STATUS_NUM);
            br.setResultStr(CommonConstant.SAVE_USER_FAILED);
        }
        return br;
    }


}
