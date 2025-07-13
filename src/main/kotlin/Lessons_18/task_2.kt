package org.example.Lessons_18

abstract class Dice(
    val edge: String,
    val range: IntRange,
) {
    open fun throwNumber() {}
}

class FourDice(
    edge: String = "4",
    range: IntRange,
) : Dice(edge = edge, range = range) {
    override fun throwNumber() {
        println("В кубике с $edge гранями, выпало число ${range.random()}")
    }
}

class SixDice(
    edge: String = "6",
    range: IntRange,
) : Dice(edge = edge, range = range) {
    override fun throwNumber() {
        println("В кубике с $edge гранями, выпало число ${range.random()}")
    }
}

class EightDice(
    edge: String = "8",
    range: IntRange,
) : Dice(edge = edge, range = range) {
    override fun throwNumber() {
        println("В кубике с $edge гранями, выпало число ${range.random()}")
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