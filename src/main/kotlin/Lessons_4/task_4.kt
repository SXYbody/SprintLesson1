package org.example.Lessons_4

fun main() {

    var days = 5

    var onArm: Boolean = days % 2 != 0
    var onLeg: Boolean = days % 2 == 0
    var onBack: Boolean = days % 2 == 0
    var onPress: Boolean = days % 2 != 0

    var stringMessage = """
        Упражнения для рук:    $onArm
        Упражнения для ног:    $onLeg
        Упражнения для спины:  $onBack
        Упражнения для пресса: $onPress
    """.trimIndent()

    println(stringMessage)



}