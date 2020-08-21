package com.example.seata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @title: Account
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 15:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private Long id;

    private Long userId;

    private BigDecimal total;

    private BigDecimal used;

    private BigDecimal residue;


}
