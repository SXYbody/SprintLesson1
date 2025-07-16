package org.example.Lessons_18

import kotlin.math.pow

abstract class Box() {
    abstract fun getSquareArea(): Double
}

class Square(
    val edge: Double,
) : Box() {
    override fun getSquareArea(): Double {
        return 6 * edge.pow(2)
    }
}

class Rectangle(
    val length: Double,
    val width: Double,
    val height: Double,
) : Box() {
    override fun getSquareArea(): Double {
        return 2 * ((length * width) + (length * height) + (width * height))
    }
}

fun main() {
    val box1 = Square(20.0)
    println(box1.getSquareArea())

    val box2 = Rectangle(10.0, 30.2, 5.0)
    println(box2.getSquareArea())
}