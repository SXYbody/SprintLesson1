package org.example.Lessons_16

class Indent(
    private val numberIndent: String,
    private var readinessIndent: Boolean = false,
) {
    private fun changeReadinessIndent(indent: Boolean) {
        readinessIndent = indent
    }

    fun setRequest(request: Boolean) {
        println("Обращаемся к менеджеру...")
        changeReadinessIndent(request)
    }

    fun getStatus(): Boolean {
        return readinessIndent
    }
}

fun main() {
    val indent1 = Indent("10")
    println("Статус готовности: ${indent1.getStatus()}")
    indent1.setRequest(true)
    println("Статус готовности: ${indent1.getStatus()}")
}