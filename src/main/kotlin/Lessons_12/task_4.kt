package org.example.Lessons_12

const val TEMPERATURE_CELSIUS = 273.15

class dayStatistic2 constructor(_dayTemperature: Int, _nightTemperature: Int, _isSludge: Boolean) {

    var dayTemperature = _dayTemperature - TEMPERATURE_CELSIUS
    var nightTemperature = _nightTemperature - TEMPERATURE_CELSIUS
    var isSludge = _isSludge

    init {
        println("Температура днем: $dayTemperature C \nТемпература ночью:$nightTemperature C \nОсадки:$isSludge")
    }
}

fun main() {
    dayStatistic2(400, 30, true)
}