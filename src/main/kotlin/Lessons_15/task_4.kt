package org.example.Lessons_15

abstract class Product(
    val name: String,
    val amount: Int,
) : Searching

val listProduct = mutableListOf<Product>()

class Tool(
    name: String,
    amount: Int,
    val listOfComponent: List<Component>,
) : Product(name = name, amount = amount)

class Component(
    name: String,
    amount: Int,
) : Product(name = name, amount = amount)

interface Searching {

    fun search() {
        println("Выполняется процесс поиска")
        if (listProduct.contains(this)) {
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
    val comp1 = Component("Дека", 5)
    listProduct.add(comp1)
    val comp2 = Component("Струны", 100)
    listProduct.add(comp2)
    val comp3 = Component("Клавишы", 120)
    listProduct.add(comp3)
    val tool1 = Tool(
        "Гитара", 20, listOf(
            comp1, comp2, comp3
        )
    )
    listProduct.add(tool1)

    tool1.search()
    comp3.search()
}