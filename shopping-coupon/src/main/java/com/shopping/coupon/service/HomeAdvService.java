package com.shopping.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.common.utils.PageUtils;
import com.shopping.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-14 21:59:11
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

