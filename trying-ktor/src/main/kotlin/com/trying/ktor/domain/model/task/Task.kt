package com.trying.ktor.domain.model.task

internal data class Task(
    val name: String,
    val description: String,
    val priority: Priority
)