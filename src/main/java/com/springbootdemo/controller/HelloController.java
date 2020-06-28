package com.springbootdemo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
@Log4j2
public class HelloController  {



   @RequestMapping("hello")
    public static String  hello(){
       log.info("i'm log detail , 我在用Log4j2 , 真的好好用啊 ");
        return "index";
    }
}
