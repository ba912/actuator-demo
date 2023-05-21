package com.example.actuatordeme.actuator.library

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LibraryConfig {
    @Bean
    fun libraryEndpoint(): LibraryEndpoint {
        return LibraryEndpoint()
    }
}