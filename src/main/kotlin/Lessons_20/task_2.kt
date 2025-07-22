package org.example.Lessons_20

class Player(
    val name: String,
    val maxHealth: Int = 20,
    var health: Int,
)

fun main() {

    val treatmentHealthPlayerLambda: (Player) -> Unit = { player ->
        if (player.health >= 15) { player.health = player.maxHealth } else player.health += 5
    }

    val player1 = Player(name = "Эграссель", health = 10)
    println("Здоровье игрока сейчас: ${player1.health}")
    treatmentHealthPlayerLambda(player1)
    println("Здоровье игрока сейчас: ${player1.health}")
}
