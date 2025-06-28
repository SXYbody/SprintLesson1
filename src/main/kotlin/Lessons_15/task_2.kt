package org.example.Lessons_15

abstract class WeatherStationStats(): WeatherServer

class Temperature(
    val temp: Int,
) : WeatherStationStats()

class PrecipitationAmount(
    val precipitation: Int,
) : WeatherStationStats()

interface WeatherServer {
    fun printInfoWeather(){}
}

fun main() {
    val temp1 = Temperature(10)
    val prep1 = PrecipitationAmount(2)

    temp1.printInfoWeather()
    prep1.printInfoWeather()

}