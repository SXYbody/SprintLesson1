package org.example.Lessons_16

class GameCube(
    private val number: Int = (0..6).random()
) {
    fun cubeNumber() {
        println(number)
    }
}

fun main() {
    GameCube().cubeNumber()
}