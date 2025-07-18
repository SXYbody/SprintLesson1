package org.example.Lessons_19

class User4(
    val name: String,
    val sex: Sex,
)

enum class Sex() {
    MAN,
    WOMAN,
    NOT_SPECIFIED;

    fun getSexString(): String {
        when (this) {
            MAN -> return "Мужчина"
            WOMAN -> return "Женщина"
            NOT_SPECIFIED -> return "Не указано"
        }
    }
}

fun main() {
    val list1 = mutableListOf<User4>()

    println("Формат заполнения формы: Имя \nПол (Можно указать: Мужчина, Женщина, Не указано")
    do {

        val name = readln()
        val sex = readln()
        when (sex) {
            "мужчина" -> list1.add(User4(name, Sex.MAN))
            "женщина" -> list1.add(User4(name, Sex.WOMAN))
            "не указано" -> list1.add(User4(name, Sex.NOT_SPECIFIED))
            else -> {
                println("Введите правильно пол!")
                continue
            }
        }

        if (list1.size == 5) {
            list1.forEach { println("Имя: ${it.name} Пол: ${it.sex.getSexString()}") }
            break
        }
    } while (list1.size < 5)
}