package org.example.Lessons_14

open class Ship2(
    val name: String,
    val speed: Int = 10,
    val payLoad: Int = 150,
    val roominess: Int = 50,
) {
    fun displayInfo() {
        println("\nНазвание корабля: $name \nСкорость: $speed \nГрузоподъемность: $payLoad \nВместительность:$roominess")
    }

    open fun load() {
        println("Уникальных способов погрузки нету!")
    }
}

class Liner1(
    name: String,
    roominess: Int = 150,
) : Ship2(name = name, roominess = roominess) {

    override fun load() {
        println("Выдвинулся горизонтальный трап со шкафаута")
    }
}

class Cargo1(
    name: String,
    speed: Int = 7,
    payLoad: Int = 200,
) : Ship2(name = name, speed = speed, payLoad = payLoad) {

    override fun load() {
        println("Активировалось погрузочные краны")
    }
}

class Icebreaker1(
    name: String,
    speed: Int = 5,
    roominess: Int = 25
) : Ship2(name = name, speed = speed, roominess = roominess) {

    fun singularProperty() {
        println("Корабль $name, обладает уникальной способность - колоть лёд на своем пути!")
    }

    override fun load() {
        println("Ворота со стороны кормы открыты")
    }
}

fun main() {
    val ship1 = Ship2("Просто корабль")
    ship1.displayInfo()
    ship1.load()

    val liner1 = Liner1("Лайнер1")
    liner1.displayInfo()
    liner1.load()

    val cargo1 = Cargo1("Карго1")
    cargo1.displayInfo()
    cargo1.load()

    val iceBreak1 = Icebreaker1("Ледокол1")
    iceBreak1.displayInfo()
    iceBreak1.singularProperty()
    iceBreak1.load()

}