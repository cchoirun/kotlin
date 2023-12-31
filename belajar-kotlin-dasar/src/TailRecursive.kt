tailrec fun factorialRecursive(value: Int, total: Int = 1): Int{
    return when(value){
        1 ->total
        else -> factorialRecursive(value-1,total*value)
    }
}

fun main() {

    val result = factorialRecursive(4)
    println(result)
}