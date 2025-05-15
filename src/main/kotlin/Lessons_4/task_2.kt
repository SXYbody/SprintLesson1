package org.example.Lessons_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {

    var weight = 25
    var volume = 80
    var resultWeight = (MIN_WEIGHT <= weight) and (weight < MAX_WEIGHT)
    var resultVolume = volume < MAX_VOLUME
    var resultGeneral: Boolean = resultWeight && resultVolume

    var messageResult = "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $resultGeneral"
    println(messageResult)

    weight = 50
    volume = 100
    resultWeight = (MIN_WEIGHT <= weight) and (weight < MAX_WEIGHT)
    resultVolume = volume < MAX_VOLUME
    resultGeneral= resultWeight && resultVolume

    messageResult = "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $resultGeneral"
    println(messageResult)
}
