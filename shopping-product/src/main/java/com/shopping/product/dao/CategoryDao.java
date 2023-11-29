package com.shopping.product.dao;

import com.shopping.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-13 23:49:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
