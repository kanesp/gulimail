package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Lieon
 * @email chouliwen963@gmail.com
 * @date 2022-08-04 20:17:09
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
