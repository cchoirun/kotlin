package app

import data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Niam"))
    mutableSet.add(Person("Niam"))
    mutableSet.add(Person("Choirun"))
    mutableSet.add(Person("Muhammad"))

    println(mutableSet.size)
}