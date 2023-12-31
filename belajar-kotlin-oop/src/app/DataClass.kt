package src.app

import src.data.Product

fun main() {
    val product1 = Product("Indomie", 2_500, "Food")

    val product2 = product1.copy("Supermie")
    println(product1)
    println(product2)
}