package org.example.Lessons_21

import org.example.Lessons_15.messageList

class Player(
    val name: String,
    val strength: Map<String, Experience>,
    val agility: Map<String, Experience>,
    val intellect: Map<String, Experience>,
)

class Experience(
    val value: Int,
    val listExp: MutableList<Experience>,
) {
    init {
        listExp.add(this)
    }
}

fun Map<String, Experience>.maxCategory(list: MutableList<Experience>): Set<String>? {
    if (list.maxBy { it.value } in this.values) return this.keys else return null
}

fun main() {
    val list1 = mutableListOf<Experience>()
    val player1 = Player(
        "Джонни",
        strength = mapOf("Сила" to Experience(5, list1)),
        agility = mapOf("Ловкость" to Experience(10, list1)),
        intellect = mapOf("Интеллект" to Experience(25, list1)),
    )
    println("Ваша максимально прокаченная характеристика:${player1.agility.maxCategory(list1)}")
}

// я не понимаю, как сделать это задание :(
