package org.example.Lessons_19

class Tank(
    val name: String,
    var cartridge: Cartridge? = null
) {
    fun setCartridgeTank(cartridge: Cartridge) {
        this.cartridge = cartridge
    }

    fun shoot() {
        when (cartridge) {
            null -> println("У вас нет боезопасов!")
            else -> println("Вы выстрелили! Нанесено ${cartridge?.power} урона")
        }
    }
}

enum class Cartridge(val power: Int) {
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