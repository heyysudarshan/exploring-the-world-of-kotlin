package com.trying.kotlin.oop

private enum class Gender {
    Male,
    Female,
    Unspecified
}

fun main() {
    println(message = Gender.entries)
}