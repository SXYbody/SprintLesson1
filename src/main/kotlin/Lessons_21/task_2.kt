package org.example.Lessons_21

fun main() {
    val list = listOf<Int>(10, 20, 15, 63, 24)
    println(list.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    val list = this
    var count = 0
    list.forEach { if (it % 2 == 0) count += it }
    return count
}