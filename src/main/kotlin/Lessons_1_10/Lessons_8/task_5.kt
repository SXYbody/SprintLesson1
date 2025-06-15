package org.example.Lessons_1_10.Lessons_8

fun main() {

    println("Сколько ингредиентов вы планируете добавить в рецепт?")
    val userNumberIngredient = readln().toInt()
    var ingredientArray = arrayOfNulls<String>(userNumberIngredient)

    for (i in 0 until userNumberIngredient) {
        ingredientArray.set(i, readln())
    }

    println(ingredientArray.joinToString())
}