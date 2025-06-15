package org.example.Lessons_11_2

class Users2 (
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {
    fun getStatisticUser() {
        println("ID: $id, Логин: $login, Пароль: $password, Почта: $mail, \nО себе: $bio")
    }

    fun shiftPassword(oldPassword: String){
        if (password == oldPassword){
            println("Введите новый пароль:")
            password = readln()
        }
    }

    fun shiftBio(){
        println("Введите информацию о себе:")
        bio = readln()
    }
}