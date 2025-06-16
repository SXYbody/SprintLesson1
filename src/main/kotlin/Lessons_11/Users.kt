package org.example.Lessons_11

class Users(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
) {
    fun printUserInformation() {
        println("ID: $id, Логин: $login, Пароль: $password, Почта: $mail")
    }
}

fun main() {

    val user1 = Users(104, "Wiki", "12356", "killmonger@mail.ru")
    val user2 = Users(105, "Nick", "DragonLore2007", "battleFor@gmail.ru")

    user1.printUserInformation()
    user2.printUserInformation()
}