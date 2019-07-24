package com.ykbjson.server.microservice.consumer.resource;

import com.ykbjson.server.microservice.consumer.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Description：
 * Creator：yankebin
 * CreatedAt：2019/7/23
 */
@RestController
public class ConsumerResource {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ProviderClient providerClient;

    @GetMapping("/hi-resttemplate")
    public String hiResttemplate(){
        return restTemplate.getForObject("http://nacos-provider/sayHi?name=resttemplate",String.class);
    }

    @GetMapping("/hi-feign")
    public String hiFeign(@RequestParam(name = "name", defaultValue = "feign",required = false) String name){
        return providerClient.sayHi(name);
    }
}
