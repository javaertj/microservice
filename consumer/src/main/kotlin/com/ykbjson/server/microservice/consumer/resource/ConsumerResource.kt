package com.ykbjson.server.microservice.consumer.resource

import com.ykbjson.server.microservice.consumer.client.ProviderClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

/**
 * Description：消费者Controller
 * Creator：yankebin
 * CreatedAt：2019/7/23
 */
@RestController
class ConsumerResource {

    @Autowired
    internal var restTemplate: RestTemplate? = null

    @Autowired
    internal var providerClient: ProviderClient? = null

    @GetMapping("/hi-resttemplate")
    fun hiRestTemplate(): String? {
        return restTemplate!!.getForObject("http://nacos-provider/sayHi?name=resttemplate", String::class.java)
    }

    @GetMapping("/hi-feign")
    fun hiFeign(@RequestParam(name = "name", defaultValue = "feign", required = false) name: String): String {
        return providerClient!!.sayHi(name)
    }
}