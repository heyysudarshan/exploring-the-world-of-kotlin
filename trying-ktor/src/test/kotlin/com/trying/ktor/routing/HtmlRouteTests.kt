package com.trying.ktor.routing

import com.trying.ktor.serverModule
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.contentType
import io.ktor.server.testing.testApplication
import kotlin.test.Test
import kotlin.test.assertEquals

class HtmlRouteTests {
    @Test
    fun testHtmlRouteBody() {
        testApplication {
            application {
                serverModule()
            }

            val request = client.get(urlString = "/html-text")
            val expectedResult = htmlContent
            val actualResult = request.bodyAsText()
            assertEquals(expected = expectedResult, actual = actualResult)
        }
    }

    @Test
    fun testHtmlRuoteContentType() {
        testApplication {
            application {
                serverModule()
            }

            val request = client.get(urlString = "/html-text")
            val expectedResult = "html"
            val actualResult = request
                .contentType()
                ?.contentSubtype
            assertEquals(expected = expectedResult, actual = actualResult)
        }
    }
}