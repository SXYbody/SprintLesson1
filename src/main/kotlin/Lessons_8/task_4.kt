package org.example.Lessons_8

fun main() {

    val ingredientsArray = arrayOf("Картошка", "Лук", "Укроп", "Свекла", "Майонез", "Огурец", "Помидор")

    println("Список продуктов: ${ingredientsArray.joinToString()}")
    println("Напишите название ингредиента, который хотите заменить")

    val userIngredient = readln().toString()
    val userIngredientIndex = ingredientsArray.indexOf(userIngredient)

    if (userIngredientIndex != -1) {
        println("Напишите название продукта, которым хотели бы его заменить:")
    } else {
        println("Такого продукта даже нет в списке!")
        return
    }

    val userIngredients1 = readln().toString()
    ingredientsArray.set(userIngredientIndex, userIngredients1)

    println("Список продуктов: ${ingredientsArray.joinToString()}")
}