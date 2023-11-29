package com.shopping.product;

import com.shopping.product.entity.CategoryBrandRelationEntity;
import com.shopping.product.service.CategoryBrandRelationService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingProductApplicationTests {

    @Autowired
    CategoryBrandRelationService categoryBrandRelationService;


    @Test
    public void contextLoads() {
        CategoryBrandRelationEntity categoryBrandRelationEntity = new CategoryBrandRelationEntity();
        categoryBrandRelationEntity.setBrandName("abr");
        categoryBrandRelationEntity.setCatelogName("abc");
        categoryBrandRelationService.save(categoryBrandRelationEntity);
    }

    @Test
    public void test() {
        CategoryBrandRelationEntity categoryBrandRelationEntity = new CategoryBrandRelationEntity();
        categoryBrandRelationEntity.setBrandName("aaa");
        categoryBrandRelationEntity.setCatelogName("bbb");
        categoryBrandRelationService.save(categoryBrandRelationEntity);
    }



}
