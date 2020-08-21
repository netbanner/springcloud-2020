package com.example.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *@ClassName Payment8001
 *@Deacription PaymentService模块
 *@Author Administrator
 *@Date 2020/8/2 16:43
 *@Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Payment8001 {

    public static void main(String []args){
        SpringApplication.run(Payment8001.class,args);
    }
}
