package org.example.Lessons_22

data class  DataBook(
    val title: String,
    val author: String,
)

class  RegularBook(
    val title: String,
    val author: String,
)

fun main() {
    val dataBook1 = DataBook("Частушки","Народ")
    val dataBook2 = DataBook("Частушки","Народ")

    val regularBook1 = RegularBook("Гарри Поттер","Роулинг")
    val regularBook2 = RegularBook("Гарри Поттер","Роулинг")

    println(dataBook1 == dataBook2) // т.к data class у нас сравниваются значения
    println(regularBook1 == regularBook2) // тут у нас сравниваются сыллки на объекты, и они в любом случае будут разные
}