package org.example.Lessons_15

abstract class Car(
    val amountPassenger: Int,
    val quantityTonsMax: Int,
    val passengerList: MutableList<String>,
    var quantityTonsNow: Int
) : Landing {

    fun printCarInfo() {
        println("Кол-во пассажиров: $amountPassenger \n Кол-во перевозимого груза: $quantityTonsNow тонн")
    }
}

class PassengerCar(
    amountPassenger: Int = 3,
    quantityTons: Int = 0,
    passengerList: MutableList<String> = mutableListOf<String>(),
    quantityTonsNow: Int = 0,
) : Car(
    amountPassenger = amountPassenger,
    quantityTonsMax = quantityTons,
    passengerList = passengerList,
    quantityTonsNow = quantityTonsNow
)

class CargoCar(
    amountPassenger: Int = 1,
    quantityTons: Int = 2,
    passengerList: MutableList<String> = mutableListOf<String>(),
    quantityTonsNow: Int = 0,
) : Car(
    amountPassenger = amountPassenger,
    quantityTonsMax = quantityTons,
    passengerList = passengerList,
    quantityTonsNow = quantityTonsNow
), Shipping

interface Landing {

    fun addPassenger(passenger: String) {
        val car = this as Car
        if (car.passengerList.size < car.amountPassenger) {
            passengerList.add(passenger)
        } else {
            println("Места в салоне закончились!")
        }
    }

    fun removePassenger(passenger: String) {
        val car = this as Car
        if (car.passengerList.isNotEmpty()) {
            passengerList.remove(passenger)
        } else {
            println("Пассажиров больше не осталось!")
        }
    }
}

interface Shipping {

    fun addTonn(tons: Int) {
        val car = this as Car
        if ((car.quantityTonsNow < car.quantityTonsMax) && (tons <= car.quantityTonsMax)) {
            car.quantityTonsNow += tons
        } else {
            println("Машина больше не вмещает!")
        }
    }

    fun removeTonn(tons: Int) {
        val car = this as Car
        if (car.quantityTonsNow != 0) {
            car.quantityTonsNow -= 1
        } else {
            println("В машине больше нету груза..")
        }
    }
}

fun main() {
    val car1 = PassengerCar()
    val car2 = PassengerCar()
    val cargo1 = CargoCar()

    car1.addPassenger("Боб")
    car1.addPassenger("Клара")
    car1.addPassenger("Абадей")
    car1.addPassenger("Полл")

    car2.addPassenger("Кирилл")
    car2.addPassenger("Абеме")

    cargo1.addPassenger("Стинт")
    cargo1.addTonn(2)

    car1.printCarInfo()
    car2.printCarInfo()
    cargo1.printCarInfo()

}