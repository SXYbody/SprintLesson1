package org.example.Lessons_3

fun main() {

    val stateMove = "D2-D4;0"
    val splitState = stateMove.split("-",";")

    val start = splitState.get(0)
    val end = splitState.get(1)
    val numberMove = splitState.get(2)

    println("Откуда ходят - $start")
    println("Куда ходят - $end")
    println("Номер хода - $numberMove")






}