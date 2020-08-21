package com.example.seata.controller;

import com.example.seata.service.StorageService;
import com.example.springcloud.entity.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @title: StorageController
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 16:27
 */
@RestController
public class StorageController {


    @Resource
    private StorageService storageService;


    //扣除库存
    @PostMapping("/storage/decrease")
    public CommonResult decrease(Long productId,Integer count){

        storageService.decrease(productId,count);

        return  new CommonResult(200,"扣除库存");
    }

}
