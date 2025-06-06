package org.example.Lessons_8

fun main() {

    val reviewArray = arrayOf(100, 200, 150, 1000, 630, 134, 456)
    var sumReviewArray = 0

    for (i in 0 until reviewArray.size) {
        sumReviewArray += reviewArray[i]
    }

    println("Количество просмотров: $sumReviewArray")
}