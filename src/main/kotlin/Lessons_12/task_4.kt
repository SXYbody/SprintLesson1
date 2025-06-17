package org.example.Lessons_12

class dayStatistic2 constructor( _dayTemperature: Int, _nightTemperature: Int,  _isSludge: Boolean) {

    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var isSludge = _isSludge

    fun printDayState() {
        println("Температура днем: ${(dayTemperature - 32) / 1.8} C \nТемпература ночью:${(nightTemperature - 32) / 1.8} C \nОсадки:$isSludge")
    }
}

fun main() {
    dayStatistic2( 150, 30, true).printDayState()
}