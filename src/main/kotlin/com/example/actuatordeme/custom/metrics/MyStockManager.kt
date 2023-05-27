package com.example.actuatordeme.custom.metrics

import org.springframework.stereotype.Component
import java.util.function.Supplier

@Component
class MyStockManager: Supplier<Number>{
    fun getStockCount(): Long {
        return System.currentTimeMillis()
    }

    override fun get(): Number {
        return getStockCount()
    }
}