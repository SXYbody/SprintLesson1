package org.example.Lessons_2

fun main() {

    val startTrain = 9 * 60 + 39
    val longRide = 457
    val endTrain = startTrain + longRide
    val hour = endTrain / 60
    val minute = endTrain % 60

    println("Поезд прибудет в [$hour:$minute]")
}