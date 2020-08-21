package com.example.springcloud.service;

/**
 * @author Administrator
 * @title: PaymentFallbackService
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/6 23:02
 */
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_Timeout , (┬＿┬)";

    }
}
