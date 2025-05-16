package org.example.Lessons_5

fun main() {
    println("Введите год своего рождения")
    val userAge = readln().toInt()
    val userOld = 2025 - userAge

    if (userOld >= 18) println("Показать экран со скрытым контентом")
    else println("Контент заблокирован.")
}