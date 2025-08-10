package com.trying.ktor.plugins

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*

internal fun Application.installContentNegotiationPlugin() {
    install(plugin = ContentNegotiation) {
        json()
    }
}