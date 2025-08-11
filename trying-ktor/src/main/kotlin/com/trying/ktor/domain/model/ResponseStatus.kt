package com.trying.ktor.domain.model

import kotlinx.serialization.Serializable

@Serializable
internal enum class ResponseStatus {
    Succeed,
    Failed
}