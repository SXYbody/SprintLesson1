package org.example.Lessons_19

class Tank(
    val name: String,
    var cartridge: Cartridge = Cartridge.EMPTY,
) {
    fun setCartridgeTank(cartridge: Cartridge) {
        this.cartridge = cartridge
    }

    fun shoot() {
        when (cartridge) {
            Cartridge.EMPTY -> println("У вас нет боезопасов!")
            else -> println("Вы выстрелили! Нанесено ${cartridge.power} урона")
        }
    }
}

enum class Cartridge(val power: Int) {
    EMPTY(0),
    BLUE(5),
    GREEN(10),
    RED(20),
}

fun main() {
    val tank1 = Tank("T-34")
    tank1.shoot()
    tank1.setCartridgeTank(Cartridge.RED)
    tank1.shoot()
    tank1.setCartridgeTank(Cartridge.BLUE)
    tank1.shoot()
}