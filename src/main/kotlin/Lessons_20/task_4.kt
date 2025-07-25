package org.example.Lessons_20

fun printStringLambda(expression: String) {
    println({ "Вы нажали на елемент $expression" })
}

fun main() {
    val list1 = listOf("Гвоздь", "Доска", "Рыба", "Носок", "Арбузная семечка")

    list1.map { if (list1.indexOf(it) % 2 == 0) printStringLambda(it) else println(it) }
}