package com.anvigudach

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class ConfigserverApplication

fun main(args: Array<String>) {
    SpringApplication.run(ConfigserverApplication::class.java, *args)
}
