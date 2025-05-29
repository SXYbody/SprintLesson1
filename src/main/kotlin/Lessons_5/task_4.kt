package org.example.Lessons_5

fun main() {

    println("Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.")

    val userName = "Zaphod"
    val userPassword = "PanGalactic"
    val readName = readln()
    val readPassword= readln()

    if (readName == userName){
        if (readPassword == userPassword){
            println("Добро пожаловать!")
        }
    }else{
        println("Такого аккаунта нет. Хотите зарегестрироватся?")
    }
}