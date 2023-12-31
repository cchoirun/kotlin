//Covariant berguna untuk mengambil data dari class, ditandai dengan "out" sebelum parameter type


package app

class Covariant<out T>(val data: T){

    fun data(): T = data

    // Tidak boleh membuat function didalam covariant
//    fun setData(param: T){
//        data = param
//    }
}

fun main() {
    val covariantString = Covariant<String>("Niam")
    val covariantAny: Covariant<Any> = covariantString
// Hal diatas boleh karena meskipun merubah ke parentnya yakni Any namun cuma dapat mengambil data, tanpa merubah

    println(covariantAny.data)

//   covariantAny.setData(100)  // -> tidak boleh karena merubah type data

}