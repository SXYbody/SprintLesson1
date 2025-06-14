package org.example.Lessons_6

fun main() {

    val userSeconds: Int = readln().toInt()
    var timerSeconds = userSeconds

    while (userSeconds > 0) {

        timerSeconds--
        println("Осталость времени: $timerSeconds")
        Thread.sleep(1000)

        if (timerSeconds == 0) {
            println("Время вышло")
            break
        }
    }
}