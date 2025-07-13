package org.example.Lessons_18

abstract class Dice(
    val edge: String,
    val range: IntRange,
) {
    open fun throwNumber() {}
}

class FourDice(
    edge: String,
    range: IntRange,
) : Dice(edge = edge, range = range){
    override fun throwNumber() {
        println("В кубике с $edge гранями, выпало число ${range.random()}")
    }
}

class SixDice(
    edge: String,
    range: IntRange,
) : Dice(edge = edge, range = range){
    override fun throwNumber() {
        println("В кубике с $edge гранями, выпало число ${range.random()}")
    }
}

class EightDice(
    edge: String,
    range: IntRange,
) : Dice(edge = edge, range = range){
    override fun throwNumber() {
        println("В кубике с $edge гранями, выпало число ${range.random()}")
    }
}

fun main() {
    val list1 = listOf(
        FourDice("4", 1..4),
        SixDice("6", 1..6),
        EightDice("8", 1..8)
    )
    list1.map { it.throwNumber() }
}