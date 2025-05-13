package org.example.Lessons_4

const val SUNNY_WEATHER: Boolean = true
const val OPEN_TENT: Boolean = true
const val HUMIDITY: Int = 20
const val TIME_OF_YEAR: String = "Лето, Весна, Осень"

fun main() {

    val todaySunnyWeather: Boolean = true
    val todayOpenTent: Boolean = true
    val todayHumidity: Int = 20
    val todayTimeOfYear = "Зима"

    val ability: Boolean = (SUNNY_WEATHER == todaySunnyWeather)
            && (OPEN_TENT == todayOpenTent)
            && (HUMIDITY == todayHumidity)
            && (TIME_OF_YEAR == todayTimeOfYear)

    println("Благоприятные ли условия сейчас для роста бобовых? $ability")


}