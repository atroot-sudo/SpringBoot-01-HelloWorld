package com.theoldzheng;

import com.theoldzheng.bean.Car;
import com.theoldzheng.bean.Person;
import com.theoldzheng.bean.Pet;
import com.theoldzheng.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Description:声明主程序类
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.17 14:22
 */
@SpringBootApplication  //声明这是一个SpringBoot应用
public class MainApplication {


    public static void main(String[] args) {
        //返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //查看容器里面的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

//        User user = run.getBean("user", User.class);
//        User user1 = run.getBean("user", User.class);
//        System.out.println("user == user1 ?" + (user == user1));  //true 默认配置的情况下返回的都是单例对象
        User hh = run.getBean("hh", User.class);
        System.out.println(hh);
        Pet pp = run.getBean("pp", Pet.class);
        System.out.println(pp);

        Car car = run.getBean("mycar-com.theoldzheng.bean.Car", Car.class);
        System.out.println(car);
        System.out.println("************");
        String[] beanNamesForType = run.getBeanNamesForType(WebMvcProperties.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

    }
}
