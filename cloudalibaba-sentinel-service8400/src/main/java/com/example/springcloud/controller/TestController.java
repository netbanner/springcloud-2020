package com.example.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @title: TestController
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/14 9:37
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String get(){
        return "hello sentinel";
    }
}
