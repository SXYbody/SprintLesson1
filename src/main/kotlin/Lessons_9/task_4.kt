package org.example.Lessons_9

fun main() {
    println("Введите черех запятую с пробелом продукты, которые хотите внести в список:")

    val ingredientsList = readln().split(", ")
    val sortedIngredientsList = ingredientsList.sorted()

    println(sortedIngredientsList)
}