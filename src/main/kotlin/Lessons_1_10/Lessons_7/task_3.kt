package org.example.Lessons_7

fun main() {
    println("Введите число больше 0")

    val userNumber = readln().toInt()
    val range = 0..userNumber step 2

    for (i in range) {
        println(i)
    }
}