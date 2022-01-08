package org.example.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.request.*
import org.slf4j.event.*

fun Application.configureMonitoring() {
    install(CallLogging)
}