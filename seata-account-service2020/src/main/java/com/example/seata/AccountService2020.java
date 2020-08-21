package com.example.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @title: AccountService2020
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 13:37
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AccountService2020 {

    public static void main(String[] args) {
        SpringApplication.run(AccountService2020.class,args);
    }
}
