package src.app

import src.data.Car

fun main() {
    val avanza = Car("avanza","",2019)
    val toyota = Car("wuling")

    println(avanza.year)
    println(toyota.brand)

//    Secondary constructor
    val mobil = Car("Honda")
    val yamaha = Car("yamaha","Honda")
    println(mobil.brand)
    println(yamaha.name)
}