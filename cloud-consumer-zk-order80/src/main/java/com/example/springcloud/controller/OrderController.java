package com.example.springcloud.controller.controller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @title: OrderController
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/4 20:57
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {


    private static final String PAYMENT_URL = "http://zkcloud-payment-service";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/payment/zk")
    public String zk(){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/zk",String.class);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
