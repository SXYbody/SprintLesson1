package org.example.Lessons_12

import org.example.Lessons_1_10.Lessons_10.validationData

class dayStatistic() {
    var dayTemperature: Double = 0.0
    var nightTemperature: Double = 0.0
    var isSludge: Boolean = false
}

fun main() {
    val day1 = dayStatistic()
    day1.dayTemperature = 25.0
    day1.nightTemperature = 5.2
    println("1 День: \nТемпература днем - ${day1.dayTemperature}\nТемпература ночью - ${day1.nightTemperature}\nОсадки - ${day1.isSludge}")

    val day2 = dayStatistic()
    day2.dayTemperature = 26.6
    day2.isSludge = true
    println("2 День: \nТемпература днем - ${day2.dayTemperature}\nТемпература ночью - ${day2.nightTemperature}\nОсадки - ${day2.isSludge}")

    day1.isSludge = true
    println("1 День: \nТемпература днем - ${day1.dayTemperature}\nТемпература ночью - ${day1.nightTemperature}\nОсадки - ${day1.isSludge}")

    day2.isSludge = false
    day2.nightTemperature = 5.7
    println("2 День: \nТемпература днем - ${day2.dayTemperature}\nТемпература ночью - ${day2.nightTemperature}\nОсадки - ${day2.isSludge}")


}