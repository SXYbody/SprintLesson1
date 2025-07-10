package org.example.Lessons_17

class Ship(
    _name: String,
    _averageSpeed: Int,
    port: String,
) {
    var name = _name
        set(value) {
            println("Имя корабля нельзя поменять!!")
        }
}

fun main() {
    val ship1 = Ship("Титаник", 102, "26656")
    println(ship1.name)
    ship1.name = "Фольсваген"
    println(ship1.name)
}