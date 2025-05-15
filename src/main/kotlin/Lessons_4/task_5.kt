package org.example.Lessons_4

const val IS_DAMAGE = false
const val MIN_CREW = 55
const val MAX_CREW = 70
const val GET_PROVISIONS = 50
const val NICE_WEATHER = true

fun main() {

    val isDamage: Boolean = true
    val getCrew: Int = 60
    val getProvisions: Int = 60
    val niceWeather: Boolean = false

    val result1 = (isDamage == IS_DAMAGE) &&
            ((getCrew >= MIN_CREW) && (getCrew < MAX_CREW)) &&
            (getProvisions > GET_PROVISIONS)

    val result2 = (isDamage != IS_DAMAGE) &&
            (getCrew == 70) &&
            (getProvisions > GET_PROVISIONS) &&
            (niceWeather == NICE_WEATHER)

    val generalResult = """
        Повреждений корабля:  $isDamage
        Количество персонала: $getCrew
        Количество провизии:  $getProvisions
        Хорошие погодные
        условия:              $niceWeather
        Можно выдвигатся:     ${result1 || result2}
    """.trimIndent()

    println(generalResult)
}