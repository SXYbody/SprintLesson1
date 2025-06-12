package org.example.Lessons_10

fun main() {
    val numberMachine = getDiceNumber()
    val numberHuman = getDiceNumber()

    println("Вам выпало: $numberHuman \nКомпьютеру выпало: $numberMachine")

    when{
        numberHuman > numberMachine -> println("Победило человечество!")
        numberHuman < numberMachine -> println("Победили машины!")
        numberHuman == numberMachine -> println("Победила дружба!")
    }
}

fun getDiceNumber (): Int {
    return (1..6).random()
}