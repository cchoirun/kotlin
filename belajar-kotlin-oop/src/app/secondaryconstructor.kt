package src.app

import src.data.Address

fun main() {
    val address1 = Address("Jalan A","Surabaya")
    val address2 = Address("Jalan A","Surabaya","Indonesia")
    println(address1.street)
    println(address2.street)
}