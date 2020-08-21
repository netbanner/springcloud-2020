package com.example.seata.feign;

import com.example.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 * @title: StorageFeignService
 * @projectName spring-cloud-2020
 * @description: TODO
 * @date 2020/8/16 16:46
 */
@FeignClient("seata-storage-service")
public interface StorageFeignService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}
