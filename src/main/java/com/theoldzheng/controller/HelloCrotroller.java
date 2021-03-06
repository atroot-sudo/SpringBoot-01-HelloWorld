package com.theoldzheng.controller;

import com.theoldzheng.bean.Car;
import com.theoldzheng.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    Car car;

    @Autowired
    Person person;

    @RequestMapping(value = "/car")
    public Car getCar(){
        return car;
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping(value = "/person")
    public Person person(){
        return person;
    }
}
