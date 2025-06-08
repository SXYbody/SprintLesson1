package org.example.Lessons_9

const val MAX_INGREDIENTS = 5

fun main() {
    println("Введите 5 продуктов, которые хотите внести в рецепт")

    val userIngredientList = mutableListOf<String>()
    var count = 0

    do {
        val userIngredient = readln()

        if (!userIngredientList.contains(userIngredient)) {
            userIngredientList.add(userIngredient)
            count += 1
        } else {
            println("Вы уже вводили этот продукт!")
        }

    } while (count != MAX_INGREDIENTS)

    val sortedIngredientList = userIngredientList.sorted()

    println(sortedIngredientList)
}