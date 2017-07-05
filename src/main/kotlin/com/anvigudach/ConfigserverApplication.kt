package com.anvigudach

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ConfigserverApplication

fun main(args: Array<String>) {
    SpringApplication.run(ConfigserverApplication::class.java, *args)
}
