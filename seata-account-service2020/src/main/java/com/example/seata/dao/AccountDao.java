package com.example.seata.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @title: AccountDao
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 15:34
 */
@Mapper
public interface AccountDao {


    //扣除账号 余额
    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);
}
