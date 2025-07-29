package org.example.Lessons_22

data class Room(
    val width: Int,
    val length: Int,
    val height: Int,
)

fun main() {
    val room1 = Room(10, 10, 5)

    val (width, length, height) = room1
    print("Ширина: $width Длинна: $length Высота: $height")
}