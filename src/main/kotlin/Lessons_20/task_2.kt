package org.example.Lessons_20


class Player5(
    val name: String,
    val maxHealth: Int = 20,
    var health: Int,
)

fun main() {

    val treatmentHealthPlayerLambda: (Player5) -> Unit = { player -> player.health = player.maxHealth }

    val player1 = Player5(name = "Эграссель", health = 10)
    println("Здоровье игрока сейчас: ${player1.health}")
    treatmentHealthPlayerLambda(player1)
    println("Здоровье игрока сейчас: ${player1.health}")
}
