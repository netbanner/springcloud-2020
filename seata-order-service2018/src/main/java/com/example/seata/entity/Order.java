package com.example.seata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @title: Order
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 13:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;

    private Long userId;

    private Integer count;

    private Long productId;

    private BigDecimal money;

    //订单状态：0，创建中  1，已完结
    private int status;

}
