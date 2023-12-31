package src.app

import src.data.Minus
import src.data.Modulo
import src.data.Operation
import src.data.Plus

fun operationMath(value1: Int, value2: Int, operation: Operation): Int{
    return when(operation){
        is Plus -> value1+value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operationMath(10,7,Plus()))
    println(operationMath(10,7,Minus()))
    println(operationMath(10,7,Modulo()))
}