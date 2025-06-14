package org.example.Lessons_9

const val MAX_INGREDIENTS = 5

fun main() {
    println("Введите 5 продуктов, которые хотите внести в рецепт")

    val userIngredientList = mutableSetOf<String>()
    var count = 0

    while (count < MAX_INGREDIENTS) {
        val userIngredient = readln()

        if (userIngredient !in userIngredientList) {
            userIngredientList.add(userIngredient)
            count += 1
        } else {
            println("Вы уже вводили этот продукт!")
        }
    }

    val sortedIngredientList = userIngredientList.sorted().joinToString().replaceFirstChar { it.uppercase() }

    println(sortedIngredientList)
}