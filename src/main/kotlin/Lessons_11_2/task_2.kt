package org.example.Lessons_11_2

import org.example.Lessons_11.Users

fun main() {
    val user2 = Users2(105,"Nick","DragonLore2007","battleFor@gmail.ru")

    println(user2.getStatisticUser())

    println("Введите старый пароль:")
    val userPassword = readln()
    user2.shiftPassword(userPassword)

    user2.shiftBio()

    println(user2.getStatisticUser())
}