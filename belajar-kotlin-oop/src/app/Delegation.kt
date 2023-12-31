package src.app

import src.data.MyBase
import src.data.MyBaseDelegate

fun main() {
    val mybase = MyBase()
    val mybaseDelegate = MyBaseDelegate(mybase)

    mybaseDelegate.sayHello("Andi")
}