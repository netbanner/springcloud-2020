package com.example.seata.service;

/**
 * @author Administrator
 * @title: StorageService
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 16:24
 */
public interface StorageService {

    void decrease(Long productId,Integer count);
}
