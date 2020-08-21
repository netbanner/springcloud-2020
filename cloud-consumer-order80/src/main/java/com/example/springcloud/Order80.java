package com.example.springcloud;

import com.example.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Administrator
 * @title: Order80
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/4 16:11
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class Order80 {


    public static void main(String[] args) {
        SpringApplication.run(Order80.class,args);
    }
}
