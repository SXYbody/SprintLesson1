package org.example.Lessons_19

enum class Fish() {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    println("Вы можете выбрать рыбку..")
    Fish.values().forEach { println(it.name) }
}