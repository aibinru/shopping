package com.shopping.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、整合mybatis-plus
 *  导入依赖
 *
 *  配置
 *      1.配置数据源
 *          导入数据源
 *          导入驱动
 *      2.配置mybatis-plus
 */
@EnableDiscoveryClient
@MapperScan("com.shopping.product.dao")
@SpringBootApplication
public class
ShoppingProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingProductApplication.class, args);
    }

}
