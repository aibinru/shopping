package com.shopping.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.common.utils.PageUtils;
import com.shopping.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-14 22:23:39
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

