package com.example.springcloud.service;

import com.example.springcloud.entity.Payment;

/**
 * @author Administrator
 * @title: PaymentService
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date $ $
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
