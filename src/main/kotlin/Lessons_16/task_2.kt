package org.example.Lessons_16

import kotlin.math.pow

private const val numberPi: Double = 3.14

class Circle(
    private val radius: Double,
) {
    fun getArea(): Double {
        return radius.pow(2) * numberPi
    }

    fun getLong(): Double {
        return 2 * numberPi * radius
    }
}

fun main() {
    val circle1 = Circle(6.0)
    circle1.getArea()
    circle1.getLong()
}