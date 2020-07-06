package com.springbootdemo.controller.usercontroller;

import com.springbootdemo.entity.BaseResponse;
import com.springbootdemo.entity.CjyUser;
import com.springbootdemo.service.userservice.IUserManagerService;
import com.springbootdemo.utils.CommonConstant;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName:UserController
 * @Descirpiton: TODO
 * @Author: Gaoww
 * @Date: 2020/5/29 17:15
 * @Version: 1.0
 */

@RestController
@Log4j2
@RequestMapping(value = "/usermanage")
public class UserController {

    @Resource
    private IUserManagerService userManagerService;

    @RequestMapping(value = "/saveuser" , method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public BaseResponse<String> saveUser(@RequestBody CjyUser cjyUser) {
        //创建返回实例
        BaseResponse<String> br = new BaseResponse<>();
        String result = userManagerService.saveUser(cjyUser);
        if (result.equals(CommonConstant.RETURN_KEY_SUCCESS)) {
            br.setResultMark(CommonConstant.RETURN_KEY_SUCCESS);
            br.setResultStatusNum(CommonConstant.RETURN_SUCCESS_STATUS_NUM);
            br.setResultStr(CommonConstant.SAVE_USER_SUCCESS);
            log.info(CommonConstant.SAVE_USER_SUCCESS);
        }else{
            br.setResultMark(CommonConstant.RETURN_KEY_FAILED);
            br.setResultStatusNum(CommonConstant.RETURN_FAILED_STATUS_NUM);
            br.setResultStr(CommonConstant.SAVE_USER_FAILED);
            log.info(CommonConstant.SAVE_USER_FAILED);
        }
        return br;

    }

    @RequestMapping(value = "/selectuserbyId", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public BaseResponse<CjyUser> selectUserById(@RequestBody CjyUser cjyUser) {
        //创建返回实例
        BaseResponse<CjyUser> br = new BaseResponse<>();
        CjyUser resultUser = userManagerService.selectUserByPrimarykey(cjyUser.getUserId());
        br.setData(resultUser);

        return br;
    }


}
