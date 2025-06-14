package org.example.Lessons_4

const val IS_DAMAGE = false
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISIONS = 50
const val IS_WEATHER_GOOD = true

fun main() {

    val isDamage: Boolean = readln().toBoolean()
    val getCrew: Int = readln().toInt()
    val getProvisions: Int = readln().toInt()
    val isWeatherGood: Boolean = readln().toBoolean()

    val result1 = (isDamage == IS_DAMAGE) &&
            ((getCrew >= MIN_CREW) && (getCrew < MAX_CREW)) &&
            (getProvisions > MIN_PROVISIONS)

    val result2 = (isDamage != IS_DAMAGE) &&
            (getCrew == MAX_CREW) &&
            (getProvisions >= MIN_PROVISIONS) &&
            (isWeatherGood == IS_WEATHER_GOOD)

    val generalResult = """
        Повреждений корабля:  $isDamage
        Количество персонала: $getCrew
        Количество провизии:  $getProvisions
        Хорошие погодные
        условия:              $isWeatherGood
        Можно выдвигатся:     ${result1 || result2}
    """.trimIndent()

    println(generalResult)
}