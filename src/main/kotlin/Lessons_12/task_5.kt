package org.example.Lessons_12

import kotlin.random.Random

val dayList: MutableList<DayStatistic3> = mutableListOf()

class DayStatistic3(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isSludge: Boolean
)

fun averageDayTemperature(): Int {
    var sumTemp = 0
    val list1 = dayList.map { it.dayTemperature }
    for (i in list1) {
        sumTemp += i
    }
    sumTemp / list1.size

    return sumTemp
}

fun averageNightTemperature(): Int {
    var sumTemp = 0
    val list1 = dayList.map { it.nightTemperature }
    for (i in list1) {
        sumTemp += i
    }
    sumTemp / list1.size

    return sumTemp
}

fun amountDayOfSludge(): Int {
    var sumSludge = 0
    val list1 = dayList.map { it.isSludge }
    for (i in list1) {
        if (i == true) {
            sumSludge++
        }
    }
    return sumSludge
}

fun main() {

    for (i in 0..29) {
        dayList.add(DayStatistic3((-20..60).random(), (-20..20).random(), Random.nextBoolean()))
    }
    println(
        "Средняя дневная температура: ${averageDayTemperature()} " +
                "\nСредняя ночная температура: ${averageNightTemperature()} \nКол-во дней с осадками: ${amountDayOfSludge()}"
    )
}