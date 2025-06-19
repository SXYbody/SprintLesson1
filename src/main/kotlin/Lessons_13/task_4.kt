package org.example.Lessons_13

class UsersInformation3(
    val name: String,
    val phoneNumber: Long?,
    val company: String?,
) {
    fun printUserInfo() {
        println("Имя: $name \nТелефон: $phoneNumber \nКомпания: ${company ?: "Не указано"}")
    }
}

fun main() {
    val usersList: MutableList<UsersInformation3> = mutableListOf()

    val user1 = UsersInformation3(readln(), readln().toLongOrNull(), readlnOrNull())
    if (user1.phoneNumber != null) {
        usersList.add(user1)
        println(user1.company)
    } else {
        println("Вы не ввели номер телефона!")
    }
}