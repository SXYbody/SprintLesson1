package org.example.Lessons_15

abstract class Car(
    val amountPassenger: Int = 0,
    val quantityTonsMax: Int = 0,
    val passengerList: MutableList<String>,
    var quantityTonsNow: Int = 0,
) : Landing {
    override val car: Car
        get() = car

    fun printCarInfo() {
        println("Кол-во пассажиров: $amountPassenger \n Кол-во перевозимого груза: $quantityTonsNow тонн")
    }
}

class PassengerCar(
    amountPassenger: Int = 3,
    passengerList: MutableList<String> = mutableListOf<String>(),
) : Car(
    amountPassenger = amountPassenger,
    passengerList = passengerList,
)

class CargoCar(
    amountPassenger: Int = 1,
    quantityTons: Int = 2,
    passengerList: MutableList<String> = mutableListOf<String>(),
) : Car(
    amountPassenger = amountPassenger,
    quantityTonsMax = quantityTons,
    passengerList = passengerList,
), Shipping

interface Landing {
    abstract val car: Car

    fun addPassenger(passenger: String) {
        if (car.passengerList.size < car.amountPassenger) {
            car.passengerList.add(passenger)
        } else {
            println("Места в салоне закончились!")
        }
    }

    fun removePassenger(passenger: String) {
        if (car.passengerList.isNotEmpty()) {
            car.passengerList.remove(passenger)
        } else {
            println("Пассажиров больше не осталось!")
        }
    }
}

interface Shipping {
    abstract val car: Car

    fun addTonn(tons: Int) {
        if ((car.quantityTonsNow < car.quantityTonsMax) && (tons <= car.quantityTonsMax)) {
            car.quantityTonsNow += tons
        } else {
            println("Машина больше не вмещает!")
        }
    }

    fun removeTonn(tons: Int) {
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