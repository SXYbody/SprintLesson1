package org.example.Lessons_2

fun main() {

    val staffCompany = 50
    val payCheckForStaffCompany = 30000 * staffCompany

    val internCompany = 30
    val payCheckForInternCompany = 20000 * internCompany

    val generalPayCheck = payCheckForInternCompany + payCheckForStaffCompany
    val middlePayCheck = generalPayCheck/(staffCompany+internCompany)

    println("Расход на выплату постоянных сотрудников: $payCheckForStaffCompany")
    println("Общий расход на выплату всего коллектива: $generalPayCheck")
    println("Средняя зарплата после прихода стажеров: $middlePayCheck")



}