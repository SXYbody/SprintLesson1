package org.example.Lessons_10

fun main() {
    var userWin = 0

    var round = carryingRound()

    while (true) {
        println("Хотите ли вы продолжить играть?")
        val userAnswer = readln()

        if (round == 1) {
            userWin += 1
        }

        when {
            userAnswer.equals("да", ignoreCase = true) -> {
                round = carryingRound()
                round
            }
            userAnswer.equals("нет", ignoreCase = true) -> {
                println("Кол-во выигрышных партий: $userWin")
                break
            }
        }
    }
}

fun getDiceNumber(): Int {
    return (1..6).random()
}

fun carryingRound(): Int {
    val numberMachine = getDiceNumber()
    val numberHuman = getDiceNumber()

    println("Вам выпало: $numberHuman \nКомпьютеру выпало: $numberMachine")

    when {
        numberHuman > numberMachine -> {
            println("Победило человечество!")
            return 1
        }

        numberHuman < numberMachine -> println("Победили машины!")
        numberHuman == numberMachine -> println("Победила дружба!")
    }
    return 0
}