package org.example.Lessons_19

enum class Category {
    CLOTHING,
    STATIONERY,
    OTHER;

    fun getCategoryName(): String {
        when (this) {
            CLOTHING -> return "Одежда"
            STATIONERY -> return "Канцелярские товары"
            OTHER -> return "Прочее"
        }
    }
}

class Product(
    val title: String,
    val id: Int,
    val category: Category,
) {
    fun getDescription() {
        println("Назвнание продукта: $title, ID: $id, Категория: ${category.getCategoryName()}")
    }
}

fun main() {
    val product1 = Product("Рубашка", 1, Category.CLOTHING)
    product1.getDescription()

    val product2 = Product("Резинка для волос", 2, Category.OTHER)
    product2.getDescription()

}