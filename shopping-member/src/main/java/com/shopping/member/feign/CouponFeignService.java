package com.shopping.member.feign;

import com.shopping.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:艾宾如
 * @createDate:2023/7/14
 * @description:远程调用服务
 **/
/**
 * 1、远程调用的步骤
 * 1）、引入open-feign
 * 2）、编写一个接口，告诉SpringCloud这个接口需要调用远程服务
 *      1、声明接口的每个方法调用的是哪个远程服务的那个请求
 *      @EnableFeignClients//开启远程调用功能
 */
@FeignClient("shopping-coupon")
public interface CouponFeignService {
    //相当于调用 memberCoupons方法
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
