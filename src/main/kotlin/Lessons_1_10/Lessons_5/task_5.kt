package org.example.Lessons_1_10.Lessons_5

fun main() {

    println("Введите 3 часла, чтобы выйграть приз!")

    val winNumber = listOf((0..42).random(), (0..42).random(),(0..42).random())
    val userNumberList = listOf(readln().toInt(),readln().toInt(),readln().toInt())
    val guessNumber = winNumber.intersect(userNumberList).size

    when(guessNumber){
        3 -> println("Вы сорвали джекпот!!")
        2 -> println("Вы выйграли крупный приз!")
        1 -> println("Вы выйграли утешительный приз")
        else -> println("К сожелению вы проиграли :(")
    }

    println("Числа, которые нужно было угадать $winNumber")
}