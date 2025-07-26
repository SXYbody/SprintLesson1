package org.example.Lessons_21

class Player(
    val name: String,
    val strength: Map<String, Int>,
    val agility: Map<String, Int>,
    val intellect: Map<String, Int>,
)

fun Player.maxCategory(): Set<String>? {
    val listSkill = listOf(strength, agility, intellect)
    return (listSkill.maxBy { it.values.size }).keys
}

fun main() {
    val player1 = Player(
        "Кайл",
        strength = mapOf("Сила" to 10),
        agility = mapOf("Ловкость" to 2),
        intellect = mapOf("Интеллект" to 5)
    )
    println("Ваша максимальная прокачананя характеристика: ${player1.maxCategory()}")
}
