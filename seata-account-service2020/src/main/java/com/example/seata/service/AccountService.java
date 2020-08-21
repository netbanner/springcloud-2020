package com.example.seata.service;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @title: AccountService
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 15:33
 */
public interface AccountService {


    void decrease(Long userId, BigDecimal money);
}
