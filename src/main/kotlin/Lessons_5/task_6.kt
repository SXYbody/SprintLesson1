package org.example.Lessons_5

import kotlin.math.pow

fun main() {
    println("Введите ваш вес(кг) / рост(см)")

    val weight: Double = readln().toDouble()
    var growth: Double = readln().toDouble()
    val centimeterFromMeter = 100

    growth = growth / centimeterFromMeter
    val result = weight / growth.pow(2)

    println("Ваш ИМТ: ${String.format("%.2f", result)}")

    if (result < 18.5) println("Недостаточная масса тела")
    else if ((18.5 <= result) && (result < 25)) println("Нормальная масса тела")
    else if ((25 <= result) && (result < 30)) println("Избыточная масса тела")
    else if (result > 30) println("Вы жирный!")
}