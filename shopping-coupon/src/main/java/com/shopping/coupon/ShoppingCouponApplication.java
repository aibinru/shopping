package com.shopping.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient//服务注册发现中心
@SpringBootApplication
public class ShoppingCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingCouponApplication.class, args);
    }

}
