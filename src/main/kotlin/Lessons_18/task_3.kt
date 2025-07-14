package org.example.Lessons_18

abstract class Pet(
    val name: String,
) {
    open fun eat() {}
}

class Dog(
    name: String
) : Pet(name = name) {
    override fun eat() {
        println("$name -> Кости")
    }
}

class Cat(
    name: String
) : Pet(name = name) {
    override fun eat() {
        println("$name -> Рыбу")
    }
}

class Fox(
    name: String
) : Pet(name = name) {
    override fun eat() {
        println("$name -> Ягоды")
    }
}

fun main() {
    val list1 = listOf<Pet>(
        Dog("Сэм"),
        Cat("Барсик"),
        Fox("Рыжуля")
    )
    list1.map { it.eat() }
}