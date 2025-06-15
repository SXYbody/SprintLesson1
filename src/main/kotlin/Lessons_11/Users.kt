package org.example.Lessons_11

class Users (
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
){
    fun getStatisticUser(){
        println("ID: $id, Логин: $login, Пароль: $password, Почта: $mail")
    }

}