package com.shopping.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.common.utils.PageUtils;
import com.shopping.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-14 22:28:38
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

