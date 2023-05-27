package com.example.actuatordeme.custom.info

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class CustomInfoContributorConfig {
    @Bean
    fun customInfoContributor(): CustomInfoContributor {
        return CustomInfoContributor()
    }
}