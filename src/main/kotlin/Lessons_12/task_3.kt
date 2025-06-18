package org.example.Lessons_12

const val TEMPERATURE_CELSIUS = 273.15

class dayStatistic2 constructor( _dayTemperature: Int, _nightTemperature: Int,  _isSludge: Boolean) {

    var dayTemperature = _dayTemperature - TEMPERATURE_CELSIUS
    var nightTemperature = _nightTemperature - TEMPERATURE_CELSIUS
    var isSludge = _isSludge

    fun printDayState() {
        println("Температура днем: $dayTemperature C \nТемпература ночью: $nightTemperature C \nОсадки:$isSludge")
    }
}

fun main() {

    val day1 = dayStatistic2(350, 300, true)
    day1.printDayState()

}