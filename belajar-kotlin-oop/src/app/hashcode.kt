package src.app

import src.data.Company

fun main() {
    val company1 = Company("comp")
    val company2 = Company("comp")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}