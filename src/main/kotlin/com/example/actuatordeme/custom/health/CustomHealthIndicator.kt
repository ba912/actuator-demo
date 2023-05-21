package com.example.actuatordeme.custom.health

import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.HealthIndicator

class CustomHealthIndicator : HealthIndicator {
    override fun health(): Health {
        return Health
            .up()
            .withDetail("key1", "value1")
            .withDetail("key2", "value2")
            .build()
    }
}