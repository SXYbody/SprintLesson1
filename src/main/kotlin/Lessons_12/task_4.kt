package org.example.Lessons_12

const val TEMPERATURE_CELSIUS1 = 273.15

class dayStatistic3 constructor(_dayTemperature: Int, _nightTemperature: Int, _isSludge: Boolean) {

    var dayTemperature = _dayTemperature - TEMPERATURE_CELSIUS1
    var nightTemperature = _nightTemperature - TEMPERATURE_CELSIUS1
    var isSludge = _isSludge

    init {
        println("Температура днем: $dayTemperature C \nТемпература ночью:$nightTemperature C \nОсадки:$isSludge")
    }
}

fun main() {
    dayStatistic3(400, 30, true)
}