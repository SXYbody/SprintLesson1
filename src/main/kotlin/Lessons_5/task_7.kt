package org.example.Lessons_5

const val fuelFromDistance = 100

fun main() {
    println("Пожалуйста напиши по порядку: \nДистанция(км) \nРасход топлива(на 100 км) \nЦена за литр топлива")

    val distance: Float = readln().toFloat()
    val expenseFuel: Float = readln().toFloat()
    val priceFuel: Float = readln().toFloat()

    val fuel = (distance * expenseFuel) / fuelFromDistance
    val price = priceFuel * fuel

    println("Необходимое кол-во топлива для поездки %.2f".format(fuel) +
            "\nСтоимость поездки: %.2f".format(price))
}