package org.example.Lessons_20

class Robot() {

    private val phraseList = listOf("Привет!", "Ты кто?", "Кто я?", "Как я сюда попал?", "Классно выглядишь, кожанный")
    private var phrase = phraseList.random()

    fun say() {
        println(phrase)
    }

    fun setModifier(modifier: Modifier) {
        return { phrase = modifier.returnModifier(phrase) }()
    }
}

enum class Modifier {
    UPPERCASE,
    LOWERCASE;

    fun returnModifier(phrase: String): String {
        when (this) {
            UPPERCASE -> return phrase.uppercase()
            LOWERCASE -> return phrase.lowercase()
            else -> return phrase
        }
    }
}

fun main() {
    val robot1 = Robot()
    robot1.say()
    robot1.setModifier(Modifier.UPPERCASE)
    robot1.say()
}