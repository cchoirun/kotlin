package src.app

import src.data.Company

fun main() {
    val company1 = Company("comp")
    val company2 = Company("comp")

    println(company1 == company2) // false, karena beda objek, bisa diubah dengan override
    println(company1 == company1) // true
}