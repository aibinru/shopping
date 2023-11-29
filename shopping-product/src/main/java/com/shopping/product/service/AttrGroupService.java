package com.shopping.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.common.utils.PageUtils;
import com.shopping.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-13 23:49:24
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

