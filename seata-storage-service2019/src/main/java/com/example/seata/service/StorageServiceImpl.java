package com.example.seata.service;

import com.example.seata.dao.StorageDao;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @title: StorageServiceImpl
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 16:25
 */
@Slf4j
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;



    @Override
    @Transactional
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始,产品Id {},数量count {}",productId,count);
        storageDao.decrease(productId,count);
        log.info("------->storage-service中扣减库存结束");

    }
}
