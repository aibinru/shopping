package com.shopping.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.common.utils.PageUtils;
import com.shopping.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-14 22:00:53
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

