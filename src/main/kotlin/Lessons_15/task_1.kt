package org.example.Lessons_15

abstract class Animal(
    val name: String
)

interface Flyable {
    fun fly()
}

interface Swimming {
    fun swim()
}

class Duck(
    name: String,
) : Animal(name = name), Flyable, Swimming {

    override fun fly() {
        println("$name крякает и бегает!")
    }

    override fun swim() {
        println("$name плавает виляя хвостиком :>")
    }
}

class Salmon(
    name: String,
) : Animal(name = name), Swimming {
    override fun swim() {
        println("$name плавает и булькает :<")
    }
}

class Gull(
    name: String,
) : Animal(name = name), Flyable {
    override fun fly() {
        println("$name неохотно перебирает лапками...")
    }
}

fun main() {
    val duck = Duck("Утка")
    duck.fly()
    duck.swim()
    val salmon = Salmon("Карась")
    salmon.swim()
    val gull = Gull("Чайка")
    gull.fly()

}