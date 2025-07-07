package org.example.Lessons_16

class User(
    val login: String,
    private val password: String,
) {
    fun validation(userPassword: String) {
        if (userPassword == password) {
            println("Пароль введен верно!")
        }else{
            println("Пароль введен НЕВЕРНО!")
        }
    }
}

fun main() {
    println("Введите пароль")
    val user1 = User("Minecraft_", "KiLka123")
    user1.validation(readln())
}