package org.example.Lessons_5

fun main() {

    val winNumber = listOf((0..42).random(), (0..42).random(),(0..42).random())
    val userNumberList = listOf(readln().toInt(),readln().toInt(),readln().toInt())
    val guessNumber = winNumber.intersect(userNumberList).size

    if (guessNumber == 3) println("Вы сорвали джекпот!!")
    else if (guessNumber == 2) println("Вы выйграли крупный приз!")
    else if (guessNumber == 1) println("Вы выйграли утешительный приз")
    else println("К сожелению вы проиграли :(")

    println("Числа, которые нужно было угадать $winNumber")

}