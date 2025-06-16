package org.example.Lessons_11_4

class Category(
    val title: String,
    val description: String,
    val id: Int,
    val imageUrl: String,
) {}

class Recipe(
    val title: String,
    val description: String? = null,
    val id: Int,
    val imageUrl: String,
    val cookingMethod: List<String> = listOf(),
) {}

class Ingredient(
    val title: String,
    val amount: Int,
    val unit: String,
) {}

fun main() {

}