package com.ykbjson.server.microservice.consumer.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

/**
 * Description：调用nacos-provider的FeignClient
 * Creator：yankebin
 * CreatedAt：2019/7/23
 */
@FeignClient("nacos-provider")
interface ProviderClient {

    @GetMapping("/sayHi")
    fun sayHi(@RequestParam(value = "name", defaultValue = "liyin", required = false) name: String): String

}