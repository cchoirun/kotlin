package src.app

import src.data.Boss

fun main() {

    val boss1 = Boss("Niam")
    val karyawan1 = boss1.Employee("Budi")
    val karyawan2 = boss1.Employee("Agung")

    karyawan1.hi()
    karyawan2.hi()

}