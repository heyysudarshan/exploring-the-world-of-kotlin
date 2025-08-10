package com.trying.ktor.domain.model

import kotlinx.serialization.Serializable

@Serializable
internal data class ResponseMessage(
    val status: ResponseStatus,
    val message: String
)
