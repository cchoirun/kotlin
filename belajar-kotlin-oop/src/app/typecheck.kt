package src.app

import src.data.Handphone
import src.data.Laptop
import src.data.SmartPhone
import java.text.StringCharacterIterator

fun printObject(any: Any) {
    if(any is Laptop){
        println("Laptop ini namanya ${any.name}")
    }else if(any is Handphone){
        println("Handphone ini namanya ${any.name}")
    }else if(any is SmartPhone){
        println("Smartphone ini namanya ${any.name} dengan os ${any.os}")
    }
    else{
        println(any)
    }
}

fun printObjectWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop ini namanya ${any.name}")

        is Handphone -> println("Handphone ini namanya ${any.name}")

        is SmartPhone -> println("Smartphone ini namanya ${any.name} dengan os ${any.os}")

        else -> println(any)
    }
}

fun printString(any: Any){
    val result: String = any as String
    println(result)
}

fun printStringSafe(any: Any){
    val result: String? = any as? String
    println(result)
}


fun main() {
    printObject(Laptop("Lenovo"))
    printObject(1)
    printObject(Handphone("Samsung"))
    printObject(SmartPhone("iPhone","IOS"))
}