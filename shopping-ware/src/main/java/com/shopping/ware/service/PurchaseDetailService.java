package com.shopping.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.common.utils.PageUtils;
import com.shopping.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-14 22:28:38
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

