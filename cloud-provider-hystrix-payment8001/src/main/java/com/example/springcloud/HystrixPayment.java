package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author Administrator
 * @title: HystrixPayment
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/6 20:41
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class HystrixPayment {

    public static void main(String[] args) {
        SpringApplication.run(HystrixPayment.class,args);
    }
}
