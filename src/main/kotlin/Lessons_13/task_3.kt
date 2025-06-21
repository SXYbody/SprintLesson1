package org.example.Lessons_13

class UsersInformation2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {
    val usersList: List<UsersInformation2> = listOf(
        UsersInformation2("Уолтер", 79628456233),
        UsersInformation2("Смитт", 79628456234),
        UsersInformation2("Андрей", 79628456235, "Reddit"),
        UsersInformation2("Шерлок", 79628456236, "Sony"),
        UsersInformation2("Кеша", 79628456231, "null")
    )

    val companies = usersList.mapNotNull { it.company }.toSet()
    println("Список компаний в телефонной книге: $companies")
}
