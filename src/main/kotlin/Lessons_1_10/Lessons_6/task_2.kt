package org.example.Lessons_1_10.Lessons_6

fun main() {

    val userSeconds: Long = readln().toLong()

    Thread.sleep(1000 * userSeconds)

    println("Прошло: $userSeconds секунд")

}