package org.example.Lessons_7

fun main() {
    println("Введите число больше 0")

    val userNumber = readln().toInt()
    val range = 0..userNumber

    for (i in range) {
        if (i % 2 == 0){
            println(i)
        }
    }
}