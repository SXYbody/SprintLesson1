package org.example.Lessons_21

import java.io.File

fun main() {
    val file1 = File("test")
    file1.prependWord("как дела")
    file1.prependWord("привеет")
}

fun File.prependWord(text: String) {
    createNewFile()
    val currentText = this.readText()
    val newText = "${text.lowercase()} \n$currentText"
    this.writeText(newText)
}