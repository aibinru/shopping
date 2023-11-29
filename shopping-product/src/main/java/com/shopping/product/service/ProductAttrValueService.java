package com.shopping.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.common.utils.PageUtils;
import com.shopping.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-13 23:49:24
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

