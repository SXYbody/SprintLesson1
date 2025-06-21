package org.example.Lessons_13

import java.text.NumberFormat

class UsersInformation4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printUserInfo() {
        println("Имя: $name \nТелефон: $phoneNumber \nКомпания: ${company ?: "Не указано"}")
    }
}

fun main() {
    try {
        val userNumber = readln().toLong()
        UsersInformation4("Клара", userNumber).printUserInfo()

    } catch (e: Exception) {
        println(e)
    }
}