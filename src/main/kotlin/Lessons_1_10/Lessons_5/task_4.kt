package org.example.Lessons_1_10.Lessons_5

fun main() {

    println("Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.")

    val userName = "Zaphod"
    val userPassword = "PanGalactic"
    val readName = readln()

    if (readName == userName) {
        println("Введите пароль")
        val readPassword = readln()

        if (readPassword == userPassword) {
            println("Добро пожаловать!")
        }
    } else {
        println("Такого аккаунта нет. Хотите зарегестрироватся?")
    }
}