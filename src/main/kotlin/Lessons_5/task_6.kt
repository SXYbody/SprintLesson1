package org.example.Lessons_5

import kotlin.math.pow

const val centimeterFromMeter = 100

const val firstHurdle = 15.5
const val secondHurdle = 25
const val threeHurdle = 30

fun main() {
    println("Введите ваш вес(кг) / рост(см)")

    val weight: Double = readln().toDouble()
    var growth: Double = readln().toDouble()

    growth = growth / centimeterFromMeter
    val result = weight / growth.pow(2)

    println("Ваш ИМТ: %.2f".format(result))

    if (result < firstHurdle) println("Недостаточная масса тела")
    else if ((firstHurdle <= result) && (result < secondHurdle)) println("Нормальная масса тела")
    else if ((secondHurdle <= result) && (result < threeHurdle)) println("Избыточная масса тела")
    else if (result > threeHurdle) println("Вы жирный!")
}