package org.example.Lessons_11_2

class Users2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String? = null
) {
    fun printUserInformation() {
        println("ID: $id, Логин: $login, Пароль: $password, Почта: $mail, \nО себе: $bio")
    }

    fun shiftPassword() {
        println("Введите свой старый пароль:")
        val oldPassword = readln()

        if (password == oldPassword) {
            println("Введите новый пароль:")
            password = readln()
        }
    }

    fun shiftBio() {
        println("Введите информацию о себе:")
        bio = readln()
    }
}

fun main() {
    val user2 = Users2(105,"Nick","DragonLore2007","battleFor@gmail.ru")

    user2.printUserInformation()
    user2.shiftPassword()
    user2.shiftBio()
    user2.printUserInformation()
}