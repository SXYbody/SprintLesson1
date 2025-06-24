package org.example.Lessons_14

import kotlin.collections.forEach

abstract class Figure(
    val color: String,
) {
    open fun calculateArea(): Int {
        return 0
    }

    open fun calculatePerimeter(): Int {
        return 0
    }
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
        Rectangle("Черный", 25, 4),
        Rectangle("Белый", 10, 7),
        Circle("Черный", 10),
        Circle("Белый", 6)
    )

    var sumBlack = 0
    var sumWhite = 0
    list1.forEach {
        when (it.color) {
            "Черный" -> sumBlack += it.calculatePerimeter()
            "Белый" -> sumWhite += it.calculateArea()
        }
    }
    println("Сумма периметров черных фигур: $sumBlack\nСумма площадей белых фигур: $sumWhite")
}