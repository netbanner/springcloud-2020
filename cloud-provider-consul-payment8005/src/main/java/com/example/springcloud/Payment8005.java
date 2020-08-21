package com.example.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 *@ClassName Payment8001
 *@Deacription PaymentService模块
 *@Author Administrator
 *@Date 2020/8/2 16:43
 *@Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8005 {

    public static void main(String []args){
        SpringApplication.run(Payment8005.class,args);
    }
}
