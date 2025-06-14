package org.example.Lessons_7

fun main() {

    val smsRange = 1000..9999

    do {
        val smsCode = smsRange.random()

        println("Ваш код авторизации: $smsCode")
        println("Введите код для авторизации")

        val userCode = readln().toInt()

        if (smsCode == userCode) {
            println("Добро пожаловать!")
            break
        }

    } while (true)
}