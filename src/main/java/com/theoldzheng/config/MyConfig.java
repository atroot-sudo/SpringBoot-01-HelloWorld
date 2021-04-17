package com.theoldzheng.config;

import com.theoldzheng.bean.Pet;
import com.theoldzheng.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description: 配置类
 * 1、配置类里面使用@Bean注册组件，默认是单实例的
 * 2、配置类的本身也是一个组件
 * 3、proxyBeanMethod：代理类的Bean的方法
 * proxyBeanMethod=true，开启代理bean方法，那么bean就是单例的，反之就是哪一个new一个
 * 应用场景(组件依赖)：当我们的容器中的bean中有依赖的时候我们设置其为 proxyBeanMethods = false
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.17 21:23
 */
@Configuration(proxyBeanMethods = true)          //告诉SpringBoot这是一个配置类--- 与配置文件等效
public class MyConfig {
    @Bean //将组件放入容器中，并且默认以方法名作为其id，返回的对象即为在容器中的实例
    public User user() {
        return new User("张三", 15);
    }

    @Bean(value = "tomcat") //也可以通过value来指定id
    public Pet pet() {
        return new Pet("张三的宠物");
    }
}
