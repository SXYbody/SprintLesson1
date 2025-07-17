package org.example.Lessons_18

abstract class Screen() {
    open fun draw(
        abscissa: Int,
        ordinate: Int,
    ) {}

    open fun draw(
        abscissa: Float,
        ordinate: Float,
    ) {}
}

class Circle() : Screen() {
    override fun draw(abscissa: Int, ordinate: Int) {
        println("Вы нарисовали круг в координатах: x $abscissa y $ordinate")
    }

    override fun draw(abscissa: Float, ordinate: Float) {
        println("Вы нарисовали круг в координатах: x $abscissa y $ordinate")
    }
}

class Square() : Screen() {
    override fun draw(abscissa: Int, ordinate: Int) {
        println("Вы нарисовали квадрат в координатах: x $abscissa y $ordinate")
    }

    override fun draw(abscissa: Float, ordinate: Float) {
        println("Вы нарисовали квадрат в координатах: x $abscissa y $ordinate")
    }
}

class Dot() : Screen() {
    override fun draw(abscissa: Int, ordinate: Int) {
        println("Вы нарисовали точку в координатах: x $abscissa y $ordinate")
    }

    override fun draw(abscissa: Float, ordinate: Float) {
        println("Вы нарисовали точку в координатах: x $abscissa y $ordinate")
    }
}

fun main() {
    val circle1 = Circle()
    circle1.draw(10, 10)
    circle1.draw(35.5f, 10f)

    val square1 = Square()
    square1.draw(10, 10)
    square1.draw(30.5f, 10.2f)

    val dot1 = Dot()
    dot1.draw(63, 2)
    dot1.draw(10.4f, 520.1f)
}