package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Niam"),Person("Choirun"), Person("Niam")
    )

    println(set.size)
    println(set.contains(Person("Niam")))
}