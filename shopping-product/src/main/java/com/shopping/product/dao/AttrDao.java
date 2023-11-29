package com.shopping.product.dao;

import com.shopping.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-13 23:49:24
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
