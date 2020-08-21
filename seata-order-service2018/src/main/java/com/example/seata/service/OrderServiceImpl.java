package com.example.seata.service;

import com.example.seata.entity.Order;
import com.example.seata.feign.AccountFeignService;
import com.example.seata.feign.StorageFeignService;
import com.example.seata.dao.OrderDao;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @title: OrderServiceImpl
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 14:30
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {


    @Resource
    private StorageFeignService storageService;

    @Resource
    private AccountFeignService accountService;

    @Resource
    private OrderDao orderDao;

    @Override
    //@Transactional
    @GlobalTransactional(name ="create_order",rollbackFor = Exception.class)
    public void create(Order order) {

        log.info("----->开始新建订单");
        //新建订单
        orderDao.create(order);

        //扣减库存
        log.info("----->订单微服务开始调用库存，扣减产品Id {},Count {}",order.getProductId(),order.getCount());
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("----->订单微服务开始调用库存，扣减end");

        //扣减账户
        log.info("----->订单微服务开始调用账户Id{}，扣减Money {}",order.getUserId(),order.getMoney());
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("----->订单微服务开始调用账户，做扣减end");


        //修改订单状态，从零到1代表已经完成
        log.info("----->修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("----->修改订单状态结束");

        log.info("----->下订单结束了");

    }
}
