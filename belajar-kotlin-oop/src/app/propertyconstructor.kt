package src.app

import src.data.User

fun main() {
    val user1 = User("Niam","secret")
    val user2 = User("Niam2","sangat secret")

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}