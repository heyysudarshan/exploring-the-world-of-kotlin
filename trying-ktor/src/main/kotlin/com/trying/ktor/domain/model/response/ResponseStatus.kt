package com.trying.ktor.domain.model.response

import kotlinx.serialization.Serializable

@Serializable
internal enum class ResponseStatus {
    Succeed,
    Failed
}