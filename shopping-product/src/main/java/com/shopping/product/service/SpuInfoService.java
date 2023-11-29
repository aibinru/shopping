package com.shopping.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.common.utils.PageUtils;
import com.shopping.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-13 23:22:56
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

