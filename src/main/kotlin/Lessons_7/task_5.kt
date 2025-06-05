package org.example.Lessons_7

fun main() {

    val numberRange = '0'..'9'
    val lowCaseRange = 'a'..'z'
    val highCaseRange = 'A'..'Z'
    val resultRange = numberRange + lowCaseRange + highCaseRange

    println("Введите число не меньше 6")

    do {
        val lengthPassword = readln().toInt()

        if (lengthPassword < 6){
            println("Вы ввели число меньше 6...")
            continue
        }

        var password = ""

        for (i in 1..lengthPassword) {
            password += resultRange.random()
        }

        println("Ваш пароль: $password")
        break
    }while (true)
}