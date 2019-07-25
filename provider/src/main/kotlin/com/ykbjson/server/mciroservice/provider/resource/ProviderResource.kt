package com.ykbjson.server.mciroservice.provider.resource

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Description：服务者Controller
 * Creator：yankebin
 * CreatedAt：2019/7/23
 */
@RestController
class ProviderResource {
    @GetMapping("/sayHi")
    fun sayHi(@RequestParam(name = "name", defaultValue = "liyin", required = false) name: String): String {
        return "hello,$name"
    }
}