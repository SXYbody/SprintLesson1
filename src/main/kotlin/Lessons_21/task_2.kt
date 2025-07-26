package org.example.Lessons_21

fun main() {
    val list = listOf(10, 20, 15, 63, 24)
    println(list.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}