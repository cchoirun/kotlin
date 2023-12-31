package src.app

import src.data.Human

fun main() {
    val niam = Human("Niam")
    niam.sayHello("Budi")

    niam.go()
    niam.move()
}