package org.example.Lessons_21

fun main() {
    val welcomeString = "Hello"
    println(welcomeString.vowelCount())

}

fun String.vowelCount(): Int {
    val vowels = "aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ"
    var count = 0
    for (i in this) if (i in vowels) count++
    return count
}