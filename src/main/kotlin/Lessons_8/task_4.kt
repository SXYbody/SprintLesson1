package org.example.Lessons_8

fun main() {

    val ingredientsArray = arrayOf("Картошка", "Лук", "Укроп", "Свекла", "Майонез", "Огурец", "Помидор")\

    var ingredientsString = ""
    for (i in ingredientsArray) {
        ingredientsString += "$i "
    }

    println("Список продуктов: $ingredientsString")
    println("Напишите название ингредиента, который хотите заменить")

    val userIngredient = readln().toString()

    if (userIngredient in ingredientsArray) {
        println("Напишите название продукта, которым хотели бы его заменить:")
    } else {
        println("Такого продукта даже нет в списке!")
        return
    }

    val userIngredients1 = readln().toString()
    ingredientsArray.set(ingredientsArray.indexOf(userIngredient), userIngredients1)

    ingredientsString = ""
    for (i in ingredientsArray) {
        ingredientsString += "$i "
    }

    println("Список продуктов: $ingredientsString")
}