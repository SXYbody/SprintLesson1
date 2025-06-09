package org.example.Lessons_9

fun main() {

    val ingredientOmelette = listOf(2, 50, 15)
    println("Сколько вы хотите порций?")

    val userNumber = readln().toInt()

    val ingredientOmelette1 = ingredientOmelette.map {
        it * userNumber
    }

    println(
        "Для $userNumber порций омлета вам понадобится \n${ingredientOmelette1[0]} шт яиц" +
                "\n${ingredientOmelette1[1]} мл молока\n${ingredientOmelette1[2]} гр сливочного масла"
    )
}