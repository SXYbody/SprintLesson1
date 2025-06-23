package org.example.Lessons_14

open class Ship2(
    val name: String,
    val speed: Int = 10,
    val payLoad: Int = 150,
    val roominess: Int = 50,
) {
    fun printShipInfo() {
        println("\nНазвание корабля: $name \nСкорость: $speed \nГрузоподъемность: $payLoad \nВместительность:$roominess")
    }

    open fun singularProperty() {}

    open fun singularLoad() {
        println("Уникальных способов погрузки нету!")
    }
}

class Liner1(
    name: String,
    roominess: Int = 150,
) : Ship2(name = name, roominess = roominess) {

    override fun singularLoad() {
        println("Выдвинулся горизонтальный трап со шкафаута")
    }
}

class Cargo1(
    name: String,
    speed: Int = 7,
    payLoad: Int = 200,
) : Ship2(name = name, speed = speed, payLoad = payLoad) {

    override fun singularLoad() {
        println("Активировалось погрузочные краны")
    }
}

class Icebreaker1(
    name: String,
    speed: Int = 5,
    roominess: Int = 25
) : Ship2(name = name, speed = speed, roominess = roominess) {

    override fun singularProperty() {
        println("Корабль $name, обладает уникальной способность - колоть лёд на своем пути!")
    }

    override fun singularLoad() {
        println("Ворота со стороны кормы открыты")
    }
}

fun main() {
    val ship1 = Ship2("Просто корабль")
    ship1.printShipInfo()
    ship1.singularLoad()

    val liner1 = Liner1("Лайнер1")
    liner1.printShipInfo()
    liner1.singularLoad()

    val cargo1 = Cargo1("Карго1")
    cargo1.printShipInfo()
    cargo1.singularLoad()

    val iceBreak1 = Icebreaker1("Ледокол1")
    iceBreak1.printShipInfo()
    iceBreak1.singularProperty()
    iceBreak1.singularLoad()

}