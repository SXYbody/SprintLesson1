package org.example.Lessons_17

class File(
    val name: String,
)

class Folder(
    _name: String,
    _fileList: MutableList<File>,
    _isSecret: Boolean = false,
) {
    var name: String = _name
        get() = if (isSecret) "Скрытая папка" else field


    var fileList: Int = _fileList.size
        get() = if (isSecret) 0 else field

    var isSecret = _isSecret
}

fun main() {
    val folder1 = Folder(
        "Анапа2007", mutableListOf(
            File("Море"),
            File("Пляж"),
            File("Отель"),
            File("Сад"),
        )
    )
    println("Название папки: ${folder1.name}\nКол-во файлов: ${folder1.fileList}")
    folder1.isSecret = true
    println("Название папки: ${folder1.name}\nКол-во файлов: ${folder1.fileList}")
}