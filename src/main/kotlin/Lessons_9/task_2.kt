package org.example.Lessons_9

fun main() {

    val ingredientsList = mutableListOf("Лук","Макароны","Помидор")

    println("Базовые продукты в рецепте: $ingredientsList")
    println("Желаете добавить еще?")

    val userAnswer = readln().toString()

    if (userAnswer.equals("да", true)){
        println("Какой ингредиент вы хотите добавить?")
        val userIngredient = readln().toString()
        ingredientsList.add(userIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $ingredientsList")

    } else {
        return
    }
}