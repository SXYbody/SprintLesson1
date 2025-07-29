package org.example.Lessons_21

class Player(
    val name: String,
    val skills: Map<String, Int>,
)

fun Map<String, Int>.maxCategory(): String? {
    this.values.forEach { if (it == this.maxByOrNull { it.value }?.value) return this.maxByOrNull { it.value }?.key }
    return null
}

fun main() {
    val player1 = Player(
        "Джонни",
        mapOf("Сила" to 10, "Ловкость" to 5, "Интеллект" to 12)
    )
    println("Ваша максимально прокаченная характеристика: ${player1.skills.maxCategory()}")
}
