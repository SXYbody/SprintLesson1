package org.example.Lessons_9

fun main() {
    println("Введите черех запятую с пробелом продукты, которые хотите внести в список:")

    val userList = readln().split(", ")
    val ingredientsList = userList

    ingredientsList.sorted()

    println(ingredientsList)
}