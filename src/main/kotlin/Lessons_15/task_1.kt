package org.example.Lessons_15

import java.text.BreakIterator

abstract class Animal(
    val name: String
)

interface BirdMove {
    fun fly()
}

interface FishMove {
    fun swim()
}

class Duck(
    name: String,
) : Animal(name = name), BirdMove {

    override fun fly() {
        println("$name крякает и бегает!")
    }
}

class Salmon(
    name: String,
) : Animal(name = name), FishMove {
    override fun swim() {
        println("$name плавает и булькает :<")
    }
}

class Gull(
    name: String,
) : Animal(name = name), BirdMove {
    override fun fly() {
        println("$name неохотно перебирает лапками...")
    }
}

fun main() {
    val duck = Duck("Утка")
    duck.fly()
    val salmon = Salmon("Карась")
    salmon.swim()
    val gull = Gull("Чайка")
    gull.fly()

}