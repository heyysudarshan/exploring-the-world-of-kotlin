package com.trying.kotlin.oop

private class LivingBeing<AnyLivingBeing>(private val livingBeing: AnyLivingBeing) {
    fun getLivingBeing(): AnyLivingBeing {
        return livingBeing
    }
}

private class HumanThing {
    fun introduce() {
        println(message = "I'm a human being.")
    }
}

private class Animal {
    fun introduce() {
        println(message = "I'm a animal.")
    }
}

fun main() {
    val livingBeing1 = LivingBeing(livingBeing = Animal())
    val livingBeing2 = LivingBeing(livingBeing = HumanThing())

    val animal1 = livingBeing1.getLivingBeing()
    animal1.introduce()

    val human = livingBeing2.getLivingBeing()
    human.introduce()
}