package com.example.seata.service;

import com.example.seata.dao.AccountDao;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Administrator
 * @title: AccountServiceImpl
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 15:36
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
     @Transactional
    public void decrease(Long userId, BigDecimal money) {

        log.info("------->account-service中扣减账户开始,用户Id {},金额money {}",userId,money);
      /*  try{
            TimeUnit.SECONDS.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
            log.error(e.getMessage());
        }*/
        accountDao.decrease(userId,money);
        log.info("---------->account-service中扣减账户结束");
    }
}
