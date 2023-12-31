package app

import data.Function

fun main() {
    val function = Function("Niam")

    function.sayHello("Niam")
    function.sayHello<String>("Niam")

    function.sayHello(10)
    function.sayHello<Int>(10)
}