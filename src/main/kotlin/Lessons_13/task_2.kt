package org.example.Lessons_13

class UsersInformation1(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printUserInfo() {
        println("Имя: $name \nНомер: $phoneNumber \nКомпания: ${company ?: "Не указано"}")
    }
}

fun main() {
    val user1 = UsersInformation1("Уолтер", 79628456235)
    user1.printUserInfo()
}