package org.example.Lessons_4

const val IS_SUNNY: Boolean = true
const val IS_TENT_OPEN: Boolean = true
    const val IS_HUMIDITY: Int = 20
const val IS_NEVER_TIME: String = "Зима"

fun main() {

    val isSunnyToday: Boolean = true
    val isTentOpenToday: Boolean = true
    val isHumidityToday: Int = 20
    val isNeverTimeToday = "Зима"

    val ability: Boolean = (IS_SUNNY == isSunnyToday) &&
            (IS_TENT_OPEN == isTentOpenToday) &&
            (IS_HUMIDITY == isHumidityToday) &&
            (IS_NEVER_TIME != isNeverTimeToday)

    println("Благоприятные ли условия сейчас для роста бобовых? $ability")
}