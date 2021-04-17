package com.theoldzheng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:控制器类
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.17 14:25
 */
//@ResponseBody
//@Controller

@RestController
public class HelloCrotroller {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world";
    }
}
