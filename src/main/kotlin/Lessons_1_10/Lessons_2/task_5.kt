package org.example.Lessons_2

import kotlin.math.pow

fun main() {

    var deposit: Double = 70000.0

    deposit = deposit*(1+ 16.7/100).pow(20)
    val formatting = String.format("%.3f", deposit)

    println(formatting)
}