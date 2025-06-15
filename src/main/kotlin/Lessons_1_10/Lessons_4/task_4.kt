package org.example.Lessons_1_10.Lessons_4

fun main() {

    val days = 5
    val isEven = days % 2 == 0

    var stringMessage = """
        Упражнения для рук:    ${!isEven}
        Упражнения для ног:    $isEven
        Упражнения для спины:  $isEven
        Упражнения для пресса: ${!isEven}
    """.trimIndent()

    println(stringMessage)
}