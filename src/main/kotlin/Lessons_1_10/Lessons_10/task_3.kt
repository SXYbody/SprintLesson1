package org.example.Lessons_1_10.Lessons_10

fun main() {

    println("Введите длинну пароля, который хотите сгенерировать.")
    val userLength = readln().toInt()
    println("Ваш пароль: ${generationPassword(lengthPassword = userLength)}")
}

fun generationPassword(lengthPassword: Int): String {
    var password = ""
    val numberRange = 0..9
    val symbolRange = arrayOf("!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", " ")

    for (i in 0 until lengthPassword) {
        if (i % 2 != 0) {
            password += symbolRange.random()
        } else {
            password += numberRange.random()
        }
    }
    return password
}