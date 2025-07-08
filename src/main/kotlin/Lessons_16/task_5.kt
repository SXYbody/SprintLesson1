package org.example.Lessons_16

class Player(
    private val name: String,
    private var health: Int,
    private var damage: Int,
) {
    private fun diedToPlayer(): String {
        health = 0
        damage = 0
        return "Вы погибли!"
    }

    fun damageToHealth(damage: Int): String? {
        if (health > damage) {
            health -= damage
            return "Вам нанесли $damage урона!"
        }
        return diedToPlayer()
    }

    fun treatmentToHealth(treatment: Int): String {
        health += treatment
        return "Вам восстановили $treatment здоровья"
    }
}

fun main() {
    val player1 = Player("оЛЕНЬ", 30, 10)
    println(player1.damageToHealth(10))
    println(player1.damageToHealth(10))
    println(player1.treatmentToHealth(3))
    println(player1.damageToHealth(30))
}