package com.trying.kotlin.collections

private fun prettyPrint(title: String, list: List<String>) {
    val prettyPrintedListString = list.joinToString(separator = ", ")
    print(message = "$title: ")
    println(message = "$prettyPrintedListString.")
}

fun main() {
    val userList = listOf("Jack", "James", "Joel", "Joe", "Julie", "John")
    prettyPrint(title = "Revered list", list = userList.reversed())
    prettyPrint(title = "Sorted list", list = userList.sorted())
}