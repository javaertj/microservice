package com.ykbjson.server.microservice.consumer.config;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Description：RestTemplate配置
 * Creator：yankebin
 * CreatedAt：2019/7/23
 */
//@Configuration
//public class RestTemplateConfig {
//
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
//
//}