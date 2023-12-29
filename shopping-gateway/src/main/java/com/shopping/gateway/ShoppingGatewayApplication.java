package com.shopping.gateway;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、开启服务注册发现
 * 配置nacos的注册中心地址
 */
@EnableDiscoveryClient
//排除数据源有关的配置
@SpringBootApplication(exclude={DruidDataSourceAutoConfigure.class,DataSourceAutoConfiguration.class})
public class ShoppingGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingGatewayApplication.class, args);
    }

}
