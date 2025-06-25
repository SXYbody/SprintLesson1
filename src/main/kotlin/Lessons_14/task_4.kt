package org.example.Lessons_14

open class HeavenlyBody(
    val name: String,
    val atmosphere: Boolean,
    val landOnPlanet: Boolean,
)

class Planet(
    name: String,
    atmosphere: Boolean,
    landOnPlanet: Boolean,
    val companionList: MutableList<CompanionPlanet>,
) : HeavenlyBody(name = name, atmosphere = atmosphere, landOnPlanet = landOnPlanet) {

    fun printPlanetInfo() {
        println("\nНазвание планеты: $name\nАтмосфера: $atmosphere\nМесто высадки: $landOnPlanet\nСписок спутников: ${companionList.map { it.name }}")
    }
}

class CompanionPlanet(
    name: String,
    atmosphere: Boolean,
    landOnPlanet: Boolean,
) : HeavenlyBody(name = name, atmosphere = atmosphere, landOnPlanet = landOnPlanet)

fun main() {
    val planet1 = Planet(
        "PK-106-ALTz", true, true, mutableListOf(
            CompanionPlanet("Алагора", false, true),
            CompanionPlanet("Мустафар", true, false),
            CompanionPlanet("Джуан", false, false)
        )
    )

    val planet2 = Planet(
        "Дагоба", true, false, mutableListOf(
            CompanionPlanet("ZK-111-AS", false, false)
        )
    )

    planet1.printPlanetInfo()
    planet2.printPlanetInfo()
}