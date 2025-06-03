package org.example.Lessons_6

fun main() {

    val winNumber = (0..9).random()
    var rate = 5

    do {
        val userNumber: Int = readln().toInt()
        rate--

        if (userNumber == winNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            if (rate != 0) {
                println("Неверно\nКол-во попыток: $rate")
            } else {
                println("Было загаданно число: $winNumber\nТы проиграл!")
                break
            }
        }
    } while (rate != 0)
}