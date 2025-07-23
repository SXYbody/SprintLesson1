package org.example.Lessons_20

class Player(
    val name: String,
    val isKey: Boolean,
)

fun main() {
    val openDoorLambda: (Player) -> String = { player: Player ->
        if (player.isKey) "${player.name}, вы открыли дверь!" else "Похоже ключа нету.."
    }

    val player1 = Player(name = "NinjaGame11223", isKey = true)
    println(openDoorLambda(player1))

    val player2 = Player(name = "Gamer", isKey = false)
    println(openDoorLambda(player2))
}