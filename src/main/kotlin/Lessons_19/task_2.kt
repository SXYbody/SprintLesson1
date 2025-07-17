package org.example.Lessons_19

enum class Categories {
    CLOTH {
        override fun getCategoriesString(): String {
            return "Одежда"
        }
    },
    OFFICE {
        override fun getCategoriesString(): String {
            return "Канцелярские Товары"
        }
    },
    OTHER {
        override fun getCategoriesString(): String {
            return "Прочее"
        }
    };

    abstract fun getCategoriesString(): String
}

class Product(
    val title: String,
    val id: Int,
    val categories: Categories,
) {
    fun getDescription() {
        println("Назвнание продукта: $title, ID: $id, Категория: ${categories.getCategoriesString()}")
    }
}

fun main() {
    val product1 = Product("Рубашка",1, Categories.CLOTH)
    product1.getDescription()

    val product2 = Product("Резинка для волос",2, Categories.OTHER)
    product2.getDescription()

}