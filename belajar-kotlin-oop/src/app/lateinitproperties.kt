package src.app

import src.data.Television

fun main() {
    val tv = Television()

   // tv.brand = "Samsung" -> bisa inisialisasi langsung, tanpa fungsi

    tv.initTelevision("Samsung") // -> bisa dengan fungsi

    println(tv.brand)
}