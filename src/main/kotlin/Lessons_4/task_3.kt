package org.example.Lessons_4

const val isSunny: Boolean = true
const val isTentOpen: Boolean = true
const val isHumidity: Int = 20
const val isNeverTime: String = "Зима"

fun main() {

    val isSunnyToday: Boolean = true
    val isTentOpenToday: Boolean = true
    val isHumidityToday: Int = 20
    val isNeverTimeToday = "Зима"

    val ability: Boolean = (isSunny == isSunnyToday)
            && (isTentOpen == isTentOpenToday)
            && (isHumidity == isHumidityToday)
            && (isNeverTime != isNeverTimeToday)

    println("Благоприятные ли условия сейчас для роста бобовых? $ability")
}