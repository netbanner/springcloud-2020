package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @title: OrderHystrix80
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/6 21:02
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrix80 {


    public static void main(String[] args) {
        SpringApplication.run(OrderHystrix80.class,args);
    }
}
