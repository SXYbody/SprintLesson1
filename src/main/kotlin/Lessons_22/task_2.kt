package org.example.Lessons_22

data class DataBook1(
    val title: String,
    val author: String,
)

class RegularBook1(
    val title: String,
    val author: String,
)

fun main() {
    val dataBook1 = DataBook1("Частушки", "Народ")

    val regularBook1 = RegularBook1("Гарри Поттер", "Роулинг")

    println(dataBook1)
    println(regularBook1)

// data class сразу переопределяет поведение вывода и выдает свою реализацию, в которой уже прописан нормальный вывод объекта
// а тут выводит просто название и хэш-код ,и что-бы
// вывести данные придется переопределять toString или обращатся к каждому свойству объекта.
}