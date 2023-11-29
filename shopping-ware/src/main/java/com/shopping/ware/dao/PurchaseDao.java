package com.shopping.ware.dao;

import com.shopping.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-14 22:28:38
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
