package org.example.Lessons_1_10.Lessons_5

import kotlin.math.pow

const val CENTIMETER_METER = 100

const val FIRST_HURDLE = 15.5
const val SECOND_HURDLE = 25
const val THREE_HURDLE = 30

fun main() {
    println("Введите ваш вес(кг) / рост(см)")

    val weight: Double = readln().toDouble()
    var growth: Double = readln().toDouble() / CENTIMETER_METER

    val result = weight / growth.pow(2)

    println("Ваш ИМТ: %.2f".format(result))

    when {
        result < FIRST_HURDLE -> println("Недостаточная масса тела")
        (FIRST_HURDLE <= result) && (result < SECOND_HURDLE) -> println("Нормальная масса тела")
        (SECOND_HURDLE <= result) && (result < THREE_HURDLE) -> println("Избыточная масса тела")
        else -> println("Вы жирный!")
    }
}