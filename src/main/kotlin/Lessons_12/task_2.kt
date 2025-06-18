package org.example.Lessons_12

class dayStatistic1(
    var dayTemperature: Double,
    var nightTemperature: Double,
    var isSludge: Boolean)

fun main() {

    val day1 = dayStatistic1(23.4, 10.1, false)

    println(day1.dayTemperature)
    println(day1.nightTemperature)
    println(day1.isSludge)

}