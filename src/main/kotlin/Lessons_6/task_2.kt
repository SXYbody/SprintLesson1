package org.example.Lessons_6

fun main() {

    val userSeconds: Int = readln().toInt()
    var timerSeconds = userSeconds

    while (userSeconds > 0) {

        timerSeconds--
        Thread.sleep(1000)

        if (timerSeconds == 0) {
            println("Прошло: $userSeconds секунд")
            break
        }
    }
}