package org.example.Lessons_1_10.Lessons_5

fun main() {

    println("Для победы напишите любые 2 числа от 0 до 42")

    val userNumber1 = readln().toInt()
    val userNumber2 = readln().toInt()
    val winNumber1 = (0..42).random()
    val winNumber2 = (0..42).random()
    var guessesNumber: Int = 0

    if ((userNumber1 == winNumber1) || (userNumber1 == winNumber2)) guessesNumber++

    if ((userNumber2 == winNumber1) || (userNumber2 == winNumber2)) guessesNumber++

    if (guessesNumber == 2) {
        println("Поздравляем! Вы выиграли главный приз")
    } else if (guessesNumber == 1) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}