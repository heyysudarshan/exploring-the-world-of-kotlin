package com.trying.kotlin.oop

private data class ScopeObject(
    val name: String
)

@Suppress("ComplexRedundantLet")
fun main() {
    val scopeObject = ScopeObject(name = "Nothing")

    // Let scope function
    scopeObject.let {
        println(message = it.name)
    }

    // Apply scope function
    scopeObject.apply {
        println(message = name)
    }
}