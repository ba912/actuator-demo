package com.example.actuatordeme.custom.metrics

import io.micrometer.core.instrument.Gauge
import io.micrometer.core.instrument.binder.MeterBinder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MyStockMeterBinderConfig {
    @Bean
    fun customMeterBinder(myStockManager: MyStockManager): MeterBinder {
        return MeterBinder { registry ->
            Gauge.builder("my.stock", myStockManager).register(registry)
        }
    }
}