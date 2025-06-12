package org.example.Lessons_10

fun main() {
    println("Введите имя и пароль")
    val userName = readln()
    val userPassword = readln()

    validationData(name = userName, password = userPassword)
}

fun validationData(name: String, password: String) {
    if (name.count() < 4 || password.count() < 4) {
        println("Имя или пароль слишком короткий!")
    } else {
        println("Добро пожаловать: $name")
    }
}