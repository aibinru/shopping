package com.shopping.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.common.utils.PageUtils;
import com.shopping.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-13 23:22:56
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

