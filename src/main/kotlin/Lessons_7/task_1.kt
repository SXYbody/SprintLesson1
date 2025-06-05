package org.example.Lessons_7

fun main() {

    val n = (1..9)
    val l = ('a'..'z')

    println("Ваш пароль: ${l.random()}${n.random()}${l.random()}${n.random()}${l.random()}${n.random()}")
}