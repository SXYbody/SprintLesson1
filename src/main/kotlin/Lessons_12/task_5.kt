package org.example.Lessons_12

import kotlin.random.Random

val dayList: MutableList<DayStatistic3> = mutableListOf()

class DayStatistic3(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isSludge: Boolean
)

fun averageDayTemperature(): Double {
    val list1 = dayList.map { it.dayTemperature }
    return list1.average()
}

fun averageNightTemperature(): Double {
    val list1 = dayList.map { it.nightTemperature }
    return list1.average()
}

fun amountDayOfSludge(): Int {
    val list1 = dayList.map { it.isSludge }
    return list1.filter { it.and(true) }.size
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