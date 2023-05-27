package com.example.actuatordeme.custom.info

import org.springframework.boot.actuate.info.Info
import org.springframework.boot.actuate.info.InfoContributor

class CustomInfoContributor: InfoContributor {
    override fun contribute(builder: Info.Builder?) {
        builder?.withDetail("customInfo", mapOf("key1" to "value1", "key2" to "value2"))
    }
}