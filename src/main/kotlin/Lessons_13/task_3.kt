package org.example.Lessons_13

val usersList: MutableList<UsersInformation2> = mutableListOf()

class UsersInformation2(
    val userName: String,
    val userPhone: Long,
    val userCompany: String? = null,
) {
    fun printUserInfo() {
        println("Имя: $userName \nНомер: $userPhone \nКомпания: ${userCompany ?: "Не указано"}")
    }
}

fun main() {
    usersList.add(UsersInformation2("Уолтер", 79628456233, null))
    usersList.add(UsersInformation2("Смитт", 79628456234, null))
    usersList.add(UsersInformation2("Андрей", 79628456235, "Reddit"))
    usersList.add(UsersInformation2("Шерлок", 79628456236, "Sony"))
    usersList.add(UsersInformation2("Кеша", 79628456231, "null"))

    usersList.forEach {
        it.printUserInfo()
    }
}