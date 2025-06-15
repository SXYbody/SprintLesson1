package org.example.Lessons_1_10.Lessons_8

fun main() {
    val saladArray: Array<String> = arrayOf("Латук","Курица","Помидор","Огурец","Майонез","Сахури")
    val userIngredient = readln().toString()

    if(userIngredient in saladArray){
        println("Ингредиент [$userIngredient] в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет!")
    }
}