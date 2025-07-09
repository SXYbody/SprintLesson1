package org.example.Lessons_17

class Task {
    val quest: String = "Сколько материков на земле?"
        get() = field
    var answer: String = ""
        get() = field
        set(value) {
            field = value
            if (value.equals("шесть", true)) println("Правильно!") else println("Неправильно!")
        }
}

fun main() {
    val task1 = Task()
    task1.quest
    task1.answer = readln()
}