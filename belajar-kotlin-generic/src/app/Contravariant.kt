//Contravariant hanya memperbolehkan menginput data, tanpa bisa mengambil data
// Ditandai dengan "in" sebelum parameter type

package app

class Contravariant<in T>{

    fun sayHello(param: T){
        println("Hello $param")
    }

    // Tidak bisa mengambil data
  //  fun getData(): T = data // ERROR
}

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny

    contravariantString.sayHello("Niam")

    //contravariantString.getData() // ERROR
}
