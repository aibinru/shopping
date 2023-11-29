package com.shopping.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients("com.shopping.member.feign")//开启远程调用功能  服务启动后，自动扫描这个包
@EnableDiscoveryClient
@SpringBootApplication
public class ShoppingMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMemberApplication.class, args);
    }

}
