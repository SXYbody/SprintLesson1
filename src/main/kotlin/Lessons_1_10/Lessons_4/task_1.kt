package org.example.Lessons_1_10.Lessons_4

const val AMOUNT_TABLE = 13

fun main() {

    val today = 13
    val tomorrow = 9

    println("Доступность столиков на сегодня: ${today < AMOUNT_TABLE}"
            + "\nДоступность столиков на завтра: ${tomorrow < AMOUNT_TABLE}")
}
