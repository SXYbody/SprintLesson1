package org.example.Lessons_15

abstract class WeatherStationStats()

class WeatherServer() {
    fun printInfoWeather(temp: WeatherStationStats, prep: WeatherStationStats) {
        println("Температура - $temp \nКол-во осадков: $prep")
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

    WeatherServer().printInfoWeather(temp1,prep1)
}