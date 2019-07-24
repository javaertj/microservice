package com.ykbjson.server.mciroservice.provider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient


@SpringBootApplication
@EnableDiscoveryClient
class ProviderApplication

fun main(args: Array<String>) {
    runApplication<ProviderApplication>(*args)
}
