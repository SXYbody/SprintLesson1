package org.example.Lessons_19

class Ship4(
    val name: String,
    val landToEarth: Boolean
) {
    fun landfall(): Boolean {
        TODO()
    }

    fun shootToAsteroid() {
        TODO("Нужна информация для доп. логики")
    }
}

fun main() {
    val ship1 = Ship4("Звездный разрушитель",true)
    ship1.landfall()
    ship1.shootToAsteroid()
}