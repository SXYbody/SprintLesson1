package org.example.Lessons_7

fun main() {

    val numberRange = (1..9)
    val letterRange = ('a'..'z')

    println("Ваш пароль: ${letterRange.random()}${numberRange.random()}${letterRange.random()}" +
            "${numberRange.random()}${letterRange.random()}${numberRange.random()}")
}