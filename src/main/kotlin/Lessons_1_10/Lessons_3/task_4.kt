package org.example.Lessons_1_10.Lessons_3

fun main() {
    var start = "E2"
    var end = "E4"
    var numberMove = 1

    var stateMove = "[$start:$end; $numberMove ход]"
    println(stateMove)

    start = "D2"
    end = "D3"
    numberMove++

    stateMove = "[$start:$end; $numberMove ход]"
    println(stateMove)
}