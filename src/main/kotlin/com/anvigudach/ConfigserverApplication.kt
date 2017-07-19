package com.anvigudach

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
class ConfigserverApplication

fun main(args: Array<String>) {
    SpringApplication.run(ConfigserverApplication::class.java, *args)
}
