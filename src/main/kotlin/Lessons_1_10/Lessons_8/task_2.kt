package org.example.Lessons_1_10.Lessons_8

fun main() {

    val saladArray: Array<String> = arrayOf("Латук","Курица","Помидор","Огурец","Майонез","Сахури")
    val userIngredient = readln().toString()

    for (i in saladArray) {

        if (i == userIngredient) {
            println("Ингредиент [$i] в рецепте есть")
            break
        } else {
            println("Такого ингредиента в рецепте нет")
        }
    }
}