package com.example.seata.controller;

import com.example.seata.service.AccountService;
import com.example.springcloud.entity.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Administrator
 * @title: AccountController
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 16:37
 */
@RestController
public class AccountController {


    @Resource
    private AccountService accountService;

    @PostMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功");
    }
}
