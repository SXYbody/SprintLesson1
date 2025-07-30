package org.example.Lessons_22

data class GalacticGuide(
    val event: String,
    val descriptor: String,
    val time: String,
    val distanceToEarth: String,
){
    override fun toString(): String {
        return "Место: $event \nОписание: $descriptor \nВремя: $time \nВремя до Земли: $distanceToEarth световых лет"
    }
}

fun main() {
    val galacticGuide1 = GalacticGuide("Alpha Centauri", "Взрыв карликовой звезды", "17:05", "4")
    println(galacticGuide1)
}