package org.example.Lessons_19

class User4(
    val name: String,
    val sex: Sex,
)

enum class Sex {
    MAN,
    WOMAN;

    fun getSexString(): String {
        when (this) {
            MAN -> return "Мужчина"
            WOMAN -> return "Женщина"
        }
    }
}

fun main() {
    val list1 = mutableListOf<User4>()

    println("Формат заполнения формы: Имя \nПол (Укажите: мужчина или женщина \nВводите по 1 человек")
    do {

        val name = readln()
        val sex = readln()
        when (sex.lowercase()) {
            "мужчина" -> list1.add(User4(name, Sex.MAN))
            "женщина" -> list1.add(User4(name, Sex.WOMAN))
            else -> {
                println("Введите правильно пол!")
                continue
            }
        }

    } while (list1.size < 5)

    list1.forEach { println("Имя: ${it.name} Пол: ${it.sex.getSexString()}") }
}