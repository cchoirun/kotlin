package src.app

import src.data.Person

fun main() {
    val niam = Person()
    niam.firstName = "Muhammad"
    niam.middleName = "Choirun"
    niam.lastName = "Ni'am"

    niam.sayHello("niamm")
    niam.run()
    val fullname = niam.fullName()
    println(fullname)
}