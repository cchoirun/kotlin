fun main() {
    fun factorial(type: Int):Int{
        return when (type){
            1 -> 1
            else -> type * factorial(type - 1)
        }
    }

    println(factorial(5))
} 