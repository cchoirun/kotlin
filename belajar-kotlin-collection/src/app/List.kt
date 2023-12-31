package app

fun main() {
    val list: List<String> = listOf("Muhammad", "Choirun", "Ni'am")

    println(list[0])
    println(list[1])
    println(list[2])
    println(list.indexOf("Muhammad"))
    println(list.indexOf("Tidak"))
    println(list.contains("Choirun"))
    println(list.contains("Tidak"))
    println(list.containsAll(listOf("Choirun","Ni'am")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}