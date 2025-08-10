package com.trying.ktor.domain.model

import kotlinx.serialization.Serializable

@Serializable
internal data class RequestResponse(
    val statusCode: Int,
    val message: ResponseMessage
)