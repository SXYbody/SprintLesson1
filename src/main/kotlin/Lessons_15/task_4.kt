package org.example.Lessons_15

open class Product(
    val name: String,
    val amount: Int,
) {
    fun addListProduct(list: MutableList<Product>) {
        if (!list.contains(this)) {
            list.add(this)
        }
    }
}

class Tool(
    name: String,
    amount: Int,
    val listOfComponent: List<Component>,
) : Product(name = name, amount = amount), Searching

class Component(
    name: String,
    amount: Int,
) : Product(name = name, amount = amount)

interface Searching {

    fun search(list: MutableList<Product>) {
        println("Выполняется процесс поиска")
        if (list.contains<Any>(this)) {
            val product: Product = this as Product
            if (product.amount >= 0) {
                when (product) {
                    is Tool -> println(
                        "${product.name} в наличии. На складе сейчас находится: ${product.amount} " +
                                "\nКомпоненты для инструмента, которые есть на сайте: ${product.listOfComponent.map { it.name }}"
                    )

                    is Component -> println("${product.name} в наличии. На складе сейчас находится: ${product.amount}")
                }
            }
        }
    }
}

fun main() {
    val list = mutableListOf<Product>()
    val comp1 = Component("Дека", 5)
    comp1.addListProduct(list)

    val comp2 = Component("Струны", 100)
    comp2.addListProduct(list)

    val comp3 = Component("Клавишы", 120)
    comp3.addListProduct(list)

    val tool1 = Tool(
        "Гитара", 20, listOf(
            comp1, comp2
        )
    )
    tool1.addListProduct(list)

    tool1.search(list)
}