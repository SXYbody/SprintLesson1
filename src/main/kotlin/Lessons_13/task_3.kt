package org.example.Lessons_13

class UsersInformation2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printUserInfo() {
        println("Компания: ${company ?: "Не указано"}")
    }
}

fun main() {
    val usersList: MutableList<UsersInformation2> = mutableListOf()

    usersList.add(UsersInformation2("Уолтер", 79628456233))
    usersList.add(UsersInformation2("Смитт", 79628456234))
    usersList.add(UsersInformation2("Андрей", 79628456235, "Reddit"))
    usersList.add(UsersInformation2("Шерлок", 79628456236, "Sony"))
    usersList.add(UsersInformation2("Кеша", 79628456231, "null"))

    usersList.map {
        if (it.company != null){
            println(it.company)
        }
    }
}
