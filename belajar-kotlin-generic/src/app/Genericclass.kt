package app

import data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData<String, Int>("Niam", 10)
    myDataString.printlnData()

    val myDataInt: MyData<Int, String> = MyData<Int, String>(10,"Niam")
    myDataInt.printlnData()

}