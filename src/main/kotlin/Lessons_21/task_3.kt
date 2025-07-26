package org.example.Lessons_21

class Player4(
    val name: String,
    val maxHealth: Int = 20,
    var health: Int,
)

fun main() {
    val player1 = Player4("Энтони", health = 20)
    val player2 = Player4("Чарльз", health = 10)
    println(player1.isHealthy())
    println(player2.isHealthy())

}

fun Player4.isHealthy(): Boolean = health == maxHealth