package org.example.Lessons_18

class Order(
    val numberOrder: String,
) {

    fun addOrderToCart(
        product: String,
    ) {
        println("Ваш номер заказа $numberOrder \nТовар, который вы хотите заказать: $product")
    }

    fun addOrderToCart(
        product: List<String>,
    ) {
        println("Ваш номер заказа $numberOrder \nТовары, которые вы хотите заказать: ${product.map { it }}")
    }
}

fun main() {
    val order1 = Order("124")
    order1.addOrderToCart("Плюшевая игрушка")

    val order2 = Order("125")
    order2.addOrderToCart(listOf("Плед", "Гитара", "Плакат"))
}