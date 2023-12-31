package src.app

import src.data.Person

fun main() {
    val niam = Person()
    niam.firstName = "Muhammad"

    niam.sayHello("Joko")
    niam.sayHello("Budi","Asep")
}