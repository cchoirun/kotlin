package app

class Invariant<T>(val data: T){
    fun data(): T = data
}

fun main() {
    val invariantString = Invariant<String>("Niam")


//    Ini tidak boleh karena yang sebelumnya String tapi dapat diassign menjadi Any, bahaya
   // val invariantAny: Invariant<Any> = invariantString // ERROR

}