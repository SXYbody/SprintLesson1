package org.example.Lessons_8

fun main() {

    println("Сколько ингредиентов вы планируете добавить в рецепт?")
    val userNumberIngredient = readln().toInt()
    var ingredientArray = arrayOf("")
    var ingredientString = ""

    var count = 0
    do {
        count += 1
        ingredientArray += readln()

    } while (count != userNumberIngredient)

    for (i in ingredientArray) {
        ingredientString += "$i "
    }

    println(ingredientString)
}