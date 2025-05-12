package org.example.Lessons_3

fun main() {

    val stateMove = "D2-D4;0"

    val start = stateMove.split("-",";").get(0)
    val end = stateMove.split("-",";").get(1)
    val numberMove = stateMove.split("-",";").get(2)

    println("Откуда ходят - $start")
    println("Куда ходят - $end")
    println("Номер хода - $numberMove")






}