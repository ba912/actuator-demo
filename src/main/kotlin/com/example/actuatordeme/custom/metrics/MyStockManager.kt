package com.example.actuatordeme.custom.metrics

import org.springframework.stereotype.Component

@Component
class MyStockManager{
    fun getStockCount(): Long {
        return System.currentTimeMillis()
    }
}