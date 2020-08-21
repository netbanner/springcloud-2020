package com.example.seata.feign;

import com.example.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @title: AccountFeignService
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 16:48
 */
@FeignClient("seata-account-service")
public interface AccountFeignService {

    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);
}
