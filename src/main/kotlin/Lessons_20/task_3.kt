package org.example.Lessons_20

class Player1(
    val name: String,
    val isKey: Boolean,
)

fun main() {
    val openDoorLambda: (Player1) -> String = { player: Player1 ->
        if (player.isKey) "${player.name}, вы открыли дверь!" else "Похоже ключа нету.."
    }

    val player1 = Player1(name = "NinjaGame11223", isKey = true)
    println(openDoorLambda(player1))

    val player2 = Player1(name = "Gamer", isKey = false)
    println(openDoorLambda(player2))
}