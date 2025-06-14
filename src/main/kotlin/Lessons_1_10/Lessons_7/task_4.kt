package org.example.Lessons_7

fun main() {

    val userTimer = readln().toInt()

    for (i in userTimer downTo 1) {

        println("Прошло: $i секунд")

        Thread.sleep(1000)

        if (i == 1) {
            println("Время вышло!")
            break
        }
    }
}