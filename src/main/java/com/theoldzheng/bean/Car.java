package com.theoldzheng.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.18 17:17
 */
//@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private String price;

    public Car() {
    }

    public Car(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
