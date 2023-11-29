package com.shopping.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.common.utils.PageUtils;
import com.shopping.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-13 23:49:24
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

