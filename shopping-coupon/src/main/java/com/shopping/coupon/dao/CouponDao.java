package com.shopping.coupon.dao;

import com.shopping.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-14 22:00:53
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
