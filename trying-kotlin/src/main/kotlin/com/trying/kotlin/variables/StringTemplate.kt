package com.trying.kotlin.variables

@Suppress("ConvertToStringTemplate")
fun main() {
    val fullName = "Sudarshan Mhasrup"

    // Dumb way to print a variable value
    println(message = "My name is " + fullName + ".")

    // Smart way to print variable value
    println(message = "My name is $fullName.")
}