package org.example.Lessons_1_10.Lessons_5

fun main() {

    val number1 = (0..10).random()
    val number2 = (0..10).random()

    println("Решите пример: $number1 + $number2")
    val userString = readln().toInt()

    if (userString == number1 + number2) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}