package org.example.Lessons_17

class User(
    _login: String,
    _password: String,
) {
    var login = _login
        set(value) {
            field = value
            println("Логин успешно сменён!")
        }

    var password = _password
        get() = "*".repeat(field.length)
        set(value) = println("Вы не можете изменить пароль!")
}

fun main() {
    val user1 = User("Джон", "123")
    user1.login = "Бэйбик"
    println(user1.password)
    user1.password = "01234785"
}