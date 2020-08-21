package com.example.springcloud.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.springcloud.entity.CommonResult;

/**
 * @author Administrator
 * @title: CustomerBlockHandler
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/15 15:20
 */
public class CustomerBlockHandler {


    public static CommonResult handleException(BlockException e){

        return  new CommonResult(2020,"自定义异常");

    }
}
