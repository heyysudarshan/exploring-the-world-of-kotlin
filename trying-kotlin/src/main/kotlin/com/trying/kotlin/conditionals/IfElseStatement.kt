package com.trying.kotlin.conditionals

@Suppress("SameParameterValue", "ConvertTwoComparisonsToRangeCheck", "LiftReturnOrAssignment")
private fun checkShopAvailability(hour: Int): String {
    if (hour >= 10 && hour <= 17) {
        return "The shop is currently open."
    } else {
        return "The shop is currently closed."
    }
}

fun main() {
    val shopAvailability = checkShopAvailability(hour = 14)
    println(message = shopAvailability)
}