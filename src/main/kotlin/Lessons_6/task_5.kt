package org.example.Lessons_6

fun main() {
    println("Введите свои данные чтобы зарегестрироваться:\nНикнейм\nПароль")

    val userName = readln()
    val userPassword = readln()

    do {
        println("Введите свои данные чтобы войти:\nНикнейм\nПароль")

        val userName1 = readln()
        val userPassword1 = readln()

        if (userName == userName1 && userPassword == userPassword1) {

            var roll = 3

            while (roll > 0) {
                val number1 = (1..9).random()
                val number2 = (1..9).random()

                println("Чтобы войти докажите, что вы не робот.\nРешите пример: $number1 + $number2")

                val userNumber = readln().toInt()

                if (number1 + number2 == userNumber) {
                    println("Добро пожаловать!")
                    break
                } else {
                    roll--
                }
            }
            if (roll == 0) {
                println("Ты бот!")
            }
            break
        }
    } while (true)
}