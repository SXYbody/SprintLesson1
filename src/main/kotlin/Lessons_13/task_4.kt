package org.example.Lessons_13

class UsersInformation3(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printUserInfo() {
        println("Имя: $name \nТелефон: $phoneNumber \nКомпания: ${company ?: "Не указано"}")
    }
}

fun main() {
    val usersList: MutableList<UsersInformation3> = mutableListOf()

    while (true) {
        println("Введите имя:")
        val userName: String? = readLine()
        if (userName == null) break

        println("Введите номер телефона:")
        val userPhone: Long? = readln().toLongOrNull()
        if (userPhone == null) {
            println("Вы ввели некорректный номер телефона")
            continue
        }

        println("Введите компанию:")
        var userCompany = readLine()
        if (userCompany.isNullOrEmpty()) userCompany = null

        val user = UsersInformation3(name = userName, phoneNumber = userPhone, company = userCompany)
        usersList.add(user)
    }

    usersList.forEach { it.printUserInfo() }
}