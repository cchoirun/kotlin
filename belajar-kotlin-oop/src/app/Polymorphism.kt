package src.app

import src.data.Boss
import src.data.Employee
import src.data.Manager
import src.data.VicePresident

fun main() {
    var employee: Employee = Employee("Niam")
    employee.sayHello("Dudi")

    employee = Manager("Andi")
    employee.sayHello("Tini")

    employee = VicePresident("Anton")
    employee.sayHello("Nina")
}