package org.example.Lessons_17

class Task(
    _quest: String,
    _answer: String,
) {
    val quest = _quest
        get() = field
    var answer = _answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val task1 = Task("Сколько существует материков на земле?","Шесть")
    task1.quest
    task1.answer = readln()
}