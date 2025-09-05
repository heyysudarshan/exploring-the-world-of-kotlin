package com.trying.kotlin.oop

@Suppress("RedundantGetter")
private class BroadcastManager {
    var currentChannel = 0
        get() {
            return field
        }
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
}

fun main() {
    val broadcastManager = BroadcastManager()

    repeat(times = 102) {
        println(message = "Increasing the current channel by 1.")
        broadcastManager.currentChannel++
        println(message = "The current channel is: ${broadcastManager.currentChannel}.\n")
    }

    repeat(times = 102) {
        println(message = "Decreasing the current channel by 1.")
        broadcastManager.currentChannel--
        println(message = "The current channel is: ${broadcastManager.currentChannel}.\n")
    }
}