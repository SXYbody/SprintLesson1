package org.example.Lessons_6

import kotlin.math.log

fun main() {
    println("Введите свои данные чтобы зарегестрироваться:\nНикнейм\nПароль")

    val userName = readln()
    val userPassword = readln()
    var checkIn: Boolean = false

    do {
        checkIn = false
        println("Введите свои данные чтобы войти:\nНикнейм\nПароль")

        val userName1 = readln()
        val userPassword1 = readln()

        if (userName == userName1 && userPassword == userPassword1) {
            println("Вы успешно вошли!")
        } else {
            checkIn = true
        }
    } while (checkIn == true)
}
