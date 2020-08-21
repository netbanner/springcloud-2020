package com.example.seata.dao;

import com.example.seata.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @title: OrderDao
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 14:27
 */
@Mapper
public interface OrderDao {

    void create(Order order);

    void update(@Param("userId") Long userId,@Param("status") int status);
}
