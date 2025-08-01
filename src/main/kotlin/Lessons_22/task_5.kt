package org.example.Lessons_22

data class GalacticGuide(
    val event: String,
    val descriptor: String,
    val time: String,
    val distanceToEarth: String,
)

fun main() {
    val galacticGuide1 = GalacticGuide("Alpha Centauri", "Взрыв карликовой звезды", "17:05", "4")
    println("Событие: ${galacticGuide1.component1()} \nОписание: ${galacticGuide1.component2()} " +
            "\nВремя: ${galacticGuide1.component3()} \nДистанция до Земли: ${galacticGuide1.component4()} световых лет" )
}