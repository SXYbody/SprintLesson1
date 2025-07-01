package org.example.Lessons_15

abstract class WeatherStationStats()

class WeatherServer() {
    fun printInfoWeather(weatherStat: WeatherStationStats) {
        when (weatherStat) {
            is Temperature -> println("Температура: ${weatherStat.temp} градусов")
            is PrecipitationAmount -> println("Кол-во осадков ${weatherStat.precipitation} %")
        }
    }
}

class Temperature(
    val temp: Int,
) : WeatherStationStats()

class PrecipitationAmount(
    val precipitation: Int,
) : WeatherStationStats()

fun main() {
    val temp1 = Temperature(10)
    val prep1 = PrecipitationAmount(2)

    WeatherServer().printInfoWeather(temp1)
    WeatherServer().printInfoWeather(prep1)
}