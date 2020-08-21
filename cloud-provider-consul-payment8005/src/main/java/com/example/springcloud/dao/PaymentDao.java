package com.example.springcloud.dao;

import com.example.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @title: PaymentDao
 * @projectName spring-cloud-2020
 * @description: dao
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}
