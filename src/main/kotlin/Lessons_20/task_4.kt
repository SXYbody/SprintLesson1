package org.example.Lessons_20

fun printStringLambda(expression: String): String {
    return { "Вы нажали на элемент $expression" }()
}

fun main() {
    val list1 = listOf("Гвоздь", "Доска", "Рыба", "Носок", "Арбузная семечка")

    list1.map { if (list1.indexOf(it) % 2 == 0) println(printStringLambda(it)) else println(it) }
}