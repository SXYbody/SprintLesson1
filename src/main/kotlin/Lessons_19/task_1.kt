package org.example.Lessons_19

enum class Fish(
    var fishName: String,
) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {
    println("Вы можете выбрать рыбку..")
    Fish.values().forEach { println(it.fishName) }
}