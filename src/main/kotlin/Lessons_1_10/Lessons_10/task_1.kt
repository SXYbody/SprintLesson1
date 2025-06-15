package org.example.Lessons_1_10.Lessons_10

fun main() {
    val numberMachine = getDiceNumber1()
    val numberHuman = getDiceNumber1()

    println("Вам выпало: $numberHuman \nКомпьютеру выпало: $numberMachine")

    when{
        numberHuman > numberMachine -> println("Победило человечество!")
        numberHuman < numberMachine -> println("Победили машины!")
        numberHuman == numberMachine -> println("Победила дружба!")
    }
}

fun getDiceNumber1 (): Int {
    return (1..6).random()
}