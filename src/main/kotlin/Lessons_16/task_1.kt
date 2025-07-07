package org.example.Lessons_16

class GameCube(
    private val number: Int = (1..6).random()
) {
    fun getNumber() {
        println(number)
    }
}

fun main() {
    val cube = GameCube().getNumber()
}