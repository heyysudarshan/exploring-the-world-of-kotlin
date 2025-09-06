package com.trying.ktor.routing

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.jetbrains.annotations.VisibleForTesting

@VisibleForTesting
internal val htmlContent = """
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>A Sample Document Served by Ktor</title>
    </head>
    <body>
        <h1>Hi! This webpage is powered by a Ktor server.</h1>
    </body>
    </html>
""".trimIndent()

fun Application.htmlRoute() {
    routing {
        get("/html-text") {
            call.respondText(contentType = ContentType.parse("text/html"), text = htmlContent)
        }
    }
}