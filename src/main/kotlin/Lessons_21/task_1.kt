package org.example.Lessons_21

fun main() {
    val welcomeString = "Hello"
    println(welcomeString.vowelCount())

}

fun String.vowelCount(): Int {
    return this.asSequence().count(predicate = { it in "aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ" })
}
