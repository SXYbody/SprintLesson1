package org.example.Lessons_11_4

class Dish(
    val title: String,
    val category: Category,
    val recipe: Recipe,
    val ingredients: Ingredient,
) {
    fun printDishInfo() {
        println(
            "Название блюда: $title, \nКатегория блюда: ${category.title}, " +
                    "\nРецепт блюда: ${recipe.description}, \nИнгредиенты для блюда: ${ingredients.amount} ${ingredients.listOfIngredient}"
        )
    }
}

class Category(
    val title: String,
    val description: String,
    val favorite: Boolean = false,
) {
    fun printCategoryInfo() {}
}

class Recipe(
    val title: String,
    val description: String? = null,
    val amount: Int = 1,
) {
    fun printRecipeInfo() {}
}

class Ingredient(
    val listOfIngredient: List<String> = listOf(),
    val amount: List<Int> = listOf()
) {
    fun printIngredientInfo() {}
}

fun main() {
    val category1 = Category("Бургеры","Рецепты всех популярных видов бургеров")
    val category2 = Category("Десерты","Самые вкусные рецепты десертов специально для вас")
    val category3 = Category("Пицца","Пицца на любой вкус и цвет.Лучшая подборка для тебя")
    val category4 = Category("Рыба","Печеная, жареная, сушеная, любая рыба на твой вкус")

    val recipe1 = Recipe("Классический бургер")
    val recipe2 = Recipe("Чизбургер")
    val recipe3 = Recipe("Бургер с грибами и сыром")

    val ingredients1 = Ingredient()

    val dish1 = Dish("Бургер с грибами и сыром",category1,recipe3, ingredients1)

    dish1.printDishInfo()
}