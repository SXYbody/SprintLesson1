package org.example.Lessons_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {

    var weight = 20
    var volume = 80

    val resultWeight = weight in MIN_WEIGHT..MAX_WEIGHT
    val resultVolume = volume < MAX_VOLUME

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${resultWeight && resultVolume}")

    weight = 50
    volume = 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${resultWeight && resultVolume}")
}
