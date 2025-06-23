package org.example.Lessons_14

open class Ship(
    val name: String,
    val speed: Int = 10,
    val payLoad: Int = 150,
    val roominess: Int = 50,
) {
    fun printShipInfo() {
        println("\nНазвание корабля: $name \nСкорость: $speed \nГрузоподъемность: $payLoad \nВместительность:$roominess")
    }

    open fun singularProperty() {}
}

class Liner(
    name: String,
    roominess: Int = 150,
) : Ship(name = name, roominess = roominess)

class Cargo(
    name: String,
    speed: Int = 7,
    payLoad: Int = 200,
) : Ship(name = name, speed = speed, payLoad = payLoad)

class Icebreaker(
    name: String,
    speed: Int = 5,
    roominess: Int = 25
) : Ship(name = name, speed = speed, roominess = roominess) {

    override fun singularProperty() {
        println("Корабль $name, обладает уникальной способность - колоть лёд на своем пути!")
    }
}

fun main() {
    val ship1 = Ship("Просто корабль")
    ship1.printShipInfo()

    val liner1 = Liner("Лайнер1")
    liner1.printShipInfo()

    val cargo1 = Cargo("Карго1")
    cargo1.printShipInfo()

    val iceBreak1 = Icebreaker("Ледокол1")
    iceBreak1.printShipInfo()
    iceBreak1.singularProperty()
}
