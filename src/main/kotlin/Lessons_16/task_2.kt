package org.example.Lessons_16

class Circle(
    private val radius: Int,
    private val numberPi: Double = 3.14
) {
    fun dependSquare() {
        println(radius * radius * numberPi)
    }

    fun dependLength() {
        println(2 * numberPi * radius)
    }
}

fun main() {
    val circle1 = Circle(6)
    circle1.dependSquare()
    circle1.dependLength()
}