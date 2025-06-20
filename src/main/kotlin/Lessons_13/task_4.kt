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

    println("Введите имя:")
    val userName = readln()

    println("Введите номер телефона:")
    var userPhone: Long = readln().toLong()
    if (userPhone.toString() == "") {
        return
    }


    var userCompany = readLine()
    if (userCompany!!.isEmpty()) userCompany = null

    val user = UsersInformation3(name = userName, phoneNumber = userPhone, company = userCompany)
    usersList.add(user)
    user.printUserInfo()

}