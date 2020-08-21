package com.example.seata.entity;

import lombok.Data;

/**
 * @author Administrator
 * @title: Storage
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 16:17
 */
@Data
public class Storage {

    private Long id;


    //产品Id
    private Long productId;

    //总库存
    private Integer total;

    //已用库存
    private Integer used;

    //剩余库存
    private Integer residue;


}
