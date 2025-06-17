package org.example.Lessons_1_10.Lessons_10

const val NICK_NAME = "Jack_Vorobey"
const val NICK_PASSWORD = "GetPhone125"

fun main() {
    println("Авторизуйтесь, чтобы получить свой токин:\nЛогин\nПароль")
    val userName = readln()
    val userPassword = readln()

    val token = authorization(name = userName, password = userPassword)
    if (token != null) {
        println("Ваш токен: $token")
    } else {
        println("Неудачная авторизация")
        return
    }

    println("Введите ваш токен, для получения корзины:")
    val userMessageToken = readln()

    val userBasket = getBasketShop(token, userMessageToken)
    if (userBasket != null) {
        println("В вашей корзине: $userBasket")
    } else {
        println("Неудачная авторизация")
        return
    }
}

fun authorization(name: String, password: String): String? {

    if (name == NICK_NAME && password == NICK_PASSWORD) {
        generationToken()
    }
    return null
}

fun getBasketShop(token: String, userMessageToken: String): List<String>? {

    if (userMessageToken == token) {
        val listShop = listOf("Хлеб", "Молоко", "Яйца", "Творог", "Сыр")
        return listShop
    }
    return null
}

fun generationToken(): String {

    val generalRange = (0..9) + ('a'..'z') + ('A'..'Z')
    var token = ""

    for (i in 0..32) {
        token += generalRange.random()
    }
    return token
}