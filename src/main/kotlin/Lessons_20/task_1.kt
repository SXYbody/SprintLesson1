package org.example.Lessons_20

fun main() {

    val user = readln()
    val printCongratulationsNewYear: (String) -> Unit = { username: String -> println("С наступающим Новым Годом, $username!") }
    printCongratulationsNewYear(user)
}