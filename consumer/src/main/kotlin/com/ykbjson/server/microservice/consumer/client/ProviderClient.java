package com.ykbjson.server.microservice.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description：
 * Creator：yankebin
 * CreatedAt：2019/7/23
 */
@FeignClient("nacos-provider")
public interface ProviderClient {

    @GetMapping("/sayHi")
    String sayHi(@RequestParam(value = "name", defaultValue = "liyin", required = false) String name);
}
