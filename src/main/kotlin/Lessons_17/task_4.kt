package org.example.Lessons_17

class Premiss(
    val number: String,
    _location: String,
) {
    var location = _location
        set(value) {
            field = value
            locationQuantity += 1
        }
    var locationQuantity = 0
}

fun main() {
    val premiss1 = Premiss("123", "Таджикистан")
    premiss1.location = "Россия"
    premiss1.location = "Беларусь"
    println(premiss1.locationQuantity)
}
