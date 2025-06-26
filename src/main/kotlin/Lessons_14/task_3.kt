package org.example.Lessons_14

import kotlin.collections.forEach

const val BLACK_COLOR = "Черный"
const val  WHITE_COLOR = "Белый"

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Int

    abstract fun calculatePerimeter(): Int
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color = color) {

    override fun calculateArea(): Int {
        return width * height
    }

    override fun calculatePerimeter(): Int {
        return 2 * width + 2 * height
    }
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color = color) {

    override fun calculateArea(): Int {
        return (Math.PI * (radius * radius)).toInt()
    }

    override fun calculatePerimeter(): Int {
        return (2 * Math.PI * radius).toInt()
    }
}

fun main() {
    val list1 = listOf(
        Rectangle(BLACK_COLOR, 25, 4),
        Rectangle(WHITE_COLOR, 10, 7),
        Circle(BLACK_COLOR, 10),
        Circle(WHITE_COLOR, 6)
    )

    var sumBlack = 0
    var sumWhite = 0
    list1.forEach {
        when (it.color) {
            BLACK_COLOR -> sumBlack += it.calculatePerimeter()
            WHITE_COLOR -> sumWhite += it.calculateArea()
        }
    }
    println("Сумма периметров черных фигур: $sumBlack\nСумма площадей белых фигур: $sumWhite")
}