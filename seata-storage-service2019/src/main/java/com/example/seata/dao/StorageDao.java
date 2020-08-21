package com.example.seata.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @title: StorageDao
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 16:22
 */
@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
