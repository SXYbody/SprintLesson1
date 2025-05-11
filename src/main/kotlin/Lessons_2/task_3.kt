package org.example.Lessons_2

fun main() {

    val minuteSplitHour = 60
    val startTrainHour = 9
    val startTrainMinute = 39

    val startTrain = startTrainHour * minuteSplitHour + startTrainMinute
    val longRide = 457
    val endTrain = startTrain + longRide
    val hour = endTrain / minuteSplitHour
    val minute = endTrain % minuteSplitHour

    println("Поезд прибудет в [$hour:$minute]")
}