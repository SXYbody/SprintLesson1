package org.example.Lessons_5

const val FUEL_PER_100KM = 100

fun main() {
    println("Пожалуйста напиши по порядку: \nДистанция(км) \nРасход топлива(на 100 км) \nЦена за литр топлива")

    val distance: Double = readln().toDouble()
    val expenseFuel: Double = readln().toDouble()
    val priceFuel: Double = readln().toDouble()

    val fuel = (distance * expenseFuel) / FUEL_PER_100KM
    val price = priceFuel * fuel

    println("Необходимое кол-во топлива для поездки %.2f \nСтоимость поездки: %.2f".format(fuel,price))
}