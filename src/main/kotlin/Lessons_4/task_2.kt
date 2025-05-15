package org.example.Lessons_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {

    var weight = 20
    var volume = 80

    var resultGeneral: Boolean = (MIN_WEIGHT <= weight) && (weight < MAX_WEIGHT) && (volume < MAX_VOLUME)

    var messageResult = "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $resultGeneral"
    println(messageResult)

    weight = 50
    volume = 100
    resultGeneral = (MIN_WEIGHT <= weight) && (weight < MAX_WEIGHT) && (volume < MAX_VOLUME)

    messageResult = "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': $resultGeneral"
    println(messageResult)
}
