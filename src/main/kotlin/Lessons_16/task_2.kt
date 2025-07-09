package org.example.Lessons_16

import kotlin.math.pow

private const val NUMBER_PI: Double = 3.14

class Circle(
    private val radius: Double,
) {
    fun getArea(): Double {
        return radius.pow(2) * NUMBER_PI
    }

    fun getLong(): Double {
        return 2 * NUMBER_PI * radius
    }
}

fun main() {
    val circle1 = Circle(6.0)
    println(circle1.getArea())
    println(circle1.getLong())
}