package org.example.Lessons_5

const val NOW_YEAR = 2025
const val NEED_YEAR = 18

fun main() {
    println("Введите год своего рождения")
    val userYear = readln().toInt()
    val userOld = NOW_YEAR - userYear

    if (userOld >= NEED_YEAR) println("Показать экран со скрытым контентом")
    else println("Контент заблокирован.")
}