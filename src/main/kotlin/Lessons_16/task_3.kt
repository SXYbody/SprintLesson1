package org.example.Lessons_16

class User(
    private val login: String,
    private val password: String,
) {
    fun validation(userPassword: String): Boolean = userPassword == password
}

fun main() {
    println("Введите пароль")
    val user1 = User("Minecraft_", "KiLka123")
    val valid1 = user1.validation(readln())
    println(valid1)
}