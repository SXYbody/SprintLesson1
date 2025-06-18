package org.example.Lessons_11_1_5.Lessons_11_4

class Category(
    val title: String,
    val description: String,
    val id: Int,
    val imageUrl: String,
    val recipeList: List<Recipe> = listOf(),
)

class Recipe(
    val title: String,
    val id: Int,
    val imageUrl: String,
    val ingredientList: List<Ingredient> = listOf()
)

class Ingredient(
    val title: String,
    val amount: String,
    val unit: String,
)

fun main() {

}