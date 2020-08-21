package com.example.seata.controller;

import com.example.seata.entity.Order;
import com.example.seata.service.OrderService;
import com.example.springcloud.entity.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @title: OrderController
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 14:32
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    private CommonResult createOrder(Order order){
        orderService.create(order);

        return new CommonResult(200,"创建订单成功");
    }
}
