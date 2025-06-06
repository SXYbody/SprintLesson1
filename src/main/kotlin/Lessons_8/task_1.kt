package org.example.Lessons_8

fun main() {

    val reviewAD = arrayOf(100, 200, 150, 1000, 630, 134, 456)
    var resultReview = 0

    for (i in 0 until reviewAD.size){
        resultReview += reviewAD[i]
    }

    println("Количество просмотров: $resultReview")
}