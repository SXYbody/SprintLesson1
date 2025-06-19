package org.example.Lessons_13

class UsersInformation1(
    val userName: String,
    val userPhone: Long,
    val userCompany: String? = null,
) {
    fun printUserInfo() {
        println("Имя: $userName \nНомер: $userPhone \nКомпания: ${userCompany ?: "Не указано"}")
    }
}

fun main() {
    val user1 = UsersInformation1("Уолтер", 79628456235, null)
    user1.printUserInfo()
}