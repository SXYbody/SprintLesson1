package org.example.Lessons_15

abstract class Animal(
    val name: String
) : Moving

interface Moving {
    fun move()
}

class Duck(
    name: String,
) : Animal(name = name){

    override fun move() {
        println("$name крякает и бегает!")
    }
}

class Salmon(
    name: String,
) : Animal(name = name){
    override fun move() {
        println("$name плавает и булькает :<")
    }
}

class Gull(
    name: String,
) : Animal(name = name){
    override fun move() {
        println("$name неохотно перебирает лапками...")
    }
}

fun main() {
    val duck = Duck("Утка")
    duck.move()
    val salmon = Salmon("Карась")
    salmon.move()
    val gull = Gull("Чайка")
    gull.move()

}