package org.example.Lessons_21

import java.io.File

fun main() {
    val file1 = File("test")
    file1.writeTextInFile("как дела")
    file1.writeTextInFile("привеет")
}

fun File.writeTextInFile(text: String) {
    createNewFile()
    val currentText = this.readText()
    val newText = "$text $currentText"
    this.writeText(newText)
    println("Текст успешно записан в начало файла")
}