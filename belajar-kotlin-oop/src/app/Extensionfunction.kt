package src.app

import src.data.Student
import src.data.sayHello
import src.data.upperName

fun main() {
    val murid = Student("Niam",15)
    murid.sayHello("Budi")
    println(murid?.upperName)
}