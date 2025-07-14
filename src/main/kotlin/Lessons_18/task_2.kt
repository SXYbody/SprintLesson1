package org.example.Lessons_18

abstract class Dice(
    val range: IntRange,
) {
    open fun throwNumber() {}
}

class FourDice(
    range: IntRange,
) : Dice(range = range) {
    override fun throwNumber() {
        println("В кубике с 4 гранями, выпало число ${range.random()}")
    }
}

class SixDice(
    range: IntRange,
) : Dice(range = range) {
    override fun throwNumber() {
        println("В кубике с 6 гранями, выпало число ${range.random()}")
    }
}

class EightDice(
    range: IntRange,
) : Dice(range = range) {
    override fun throwNumber() {
        println("В кубике с 8 гранями, выпало число ${range.random()}")
    }
}

fun main() {
    val list1 = listOf(
        FourDice(range = 1..4),
        SixDice(range = 1..6),
        EightDice(range = 1..8)
    )
    list1.map { it.throwNumber() }
}