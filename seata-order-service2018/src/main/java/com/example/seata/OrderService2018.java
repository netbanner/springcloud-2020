package com.example.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @title: OrderService2018
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 13:02
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class OrderService2018 {

    public static void main(String[] args) {
        SpringApplication.run(OrderService2018.class,args);
    }
}
