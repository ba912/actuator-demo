package com.example.actuatordeme.actuator.library

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation
import org.springframework.boot.actuate.endpoint.annotation.Selector
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint
import org.springframework.lang.Nullable

@WebEndpoint(id = "libraries")
class LibraryEndpoint {

    private val log: Logger = LoggerFactory.getLogger(LibraryEndpoint::class.java)

    @WriteOperation
    fun addLibrary(name: String, version: String) {
        log.info("addLibrary: $name, $version")
    }

    @ReadOperation
    fun pathTest(@Selector(match = Selector.Match.ALL_REMAINING) paths: Array<String>): String {
        log.info("pathTest: ${paths.joinToString(",")}")
        return paths.joinToString(",")
    }

    @ReadOperation
    fun getLibraries(@Nullable name: String?): List<Library> {
        var libraries = createSampleLibraries()
        if (name != null) {
            libraries = libraries.filter { it.name == name }
        }
        return libraries
    }

    fun createSampleLibraries(): List<Library> {
        return listOf(
            Library("Spring Boot", "2.3.0.RELEASE"),
            Library("Spring Boot Actuator", "2.3.0.RELEASE")
        )
    }
}