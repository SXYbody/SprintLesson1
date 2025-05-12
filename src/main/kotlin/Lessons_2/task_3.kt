package org.example.Lessons_2

 const val MINUTE_IN_HOUR: Int = 60

fun main() {
    val startTrainHour = 9
    val startTrainMinute = 39

    val startTrain = startTrainHour * MINUTE_IN_HOUR + startTrainMinute
    val longRide = 457
    val endTrain = startTrain + longRide
    val hour = endTrain / MINUTE_IN_HOUR
    val minute = endTrain % MINUTE_IN_HOUR

    println("Поезд прибудет в [$hour:$minute]")
}