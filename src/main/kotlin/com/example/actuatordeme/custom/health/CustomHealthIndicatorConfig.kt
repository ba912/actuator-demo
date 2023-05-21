package com.example.actuatordeme.custom.health

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CustomHealthIndicatorConfig {

    @Bean
    fun customHealthIndicator(): CustomHealthIndicator {
        return CustomHealthIndicator()
    }
}