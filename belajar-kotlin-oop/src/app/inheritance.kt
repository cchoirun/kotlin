package src.app

import src.data.Manager
import src.data.VicePresident

fun main() {
    val niam = Manager("Niam")
    niam.sayHello("Budi")

    val niamm = VicePresident("Niamm")
    niamm.sayHello("Budi")
}