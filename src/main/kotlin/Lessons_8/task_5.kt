package org.example.Lessons_8

fun main() {

    println("Сколько ингредиентов вы планируете добавить в рецепт?")
    val userNumberIngredient = readln().toInt()
    var ingredientArray = arrayOfNulls<String>(userNumberIngredient)

    var count = 0
    do {
        ingredientArray.set(count, readln())
        count += 1

    } while (count != userNumberIngredient)

    println(ingredientArray.joinToString())
}