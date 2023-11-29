package com.shopping.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.common.utils.PageUtils;
import com.shopping.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-14 22:00:53
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

