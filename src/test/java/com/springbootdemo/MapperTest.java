package com.springbootdemo;

import com.springbootdemo.entity.CjyUser;
import com.springbootdemo.mapper.CjyUserMapper;
import com.springbootdemo.utils.JsonUtil;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @ClassName:MapperTest
 * @Descirpiton: TODO
 * @Author: Gaoww
 * @Date: 2020/6/1 17:00
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Log4j2
public class MapperTest {

    @Resource
    private CjyUserMapper cjyUserMapper;


    @Test
    public void selectUserById() {
        CjyUser cjyUser = cjyUserMapper.selectByPrimaryKey(1);
        String userJsonStr = JsonUtil.getBeanToJson(cjyUser);

        System.out.println(userJsonStr);
        log.info(userJsonStr);
    }
}
