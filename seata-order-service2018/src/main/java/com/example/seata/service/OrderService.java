package com.example.seata.service;

import com.example.seata.entity.Order;

/**
 * @author Administrator
 * @title: OrderService
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 14:29
 */
public interface OrderService {

    void create(Order order);
}
