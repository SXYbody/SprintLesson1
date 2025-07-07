package org.example.Lessons_16

class Indent(
    private val numberIndent: String,
    var readinessIndent: Boolean = false,
) {
    fun changeReadinessIndent(change: Boolean) {
        readinessIndent = change
    }

}

fun main() {
    val indent1 = Indent("10")
    println("Статус готовности: ${indent1.readinessIndent}")
    indent1.changeReadinessIndent(true)
    println("Статус готовности: ${indent1.readinessIndent}")
}