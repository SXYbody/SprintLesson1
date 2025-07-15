package org.example.Lessons_18

abstract class Dice(
    val edge: Int,
    val range: IntRange,
) {
    open fun throwNumber() {}
}

class FourDice(
    edge: Int = 4,
    range: IntRange,
) : Dice(edge = edge, range = range) {
    override fun throwNumber() {
        println("В кубике с $edge гранями, выпало число ${range.random()}")
    }
}

class SixDice(
    edge: Int = 6,
    range: IntRange,
) : Dice(edge = edge, range = range) {
    override fun throwNumber() {
        println("В кубике с $edge гранями, выпало число ${range.random()}")
    }
}

class EightDice(
    edge: Int = 8,
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