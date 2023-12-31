fun tambah(A:Int, B:Int?): Int {
    if (B == null) return A
    else return A+B
}

//Single Expression Function
fun tambahAngka(A:Int, B: Int):Int = A+B

fun sayHello(firstName: String, lastName: String= ""){
    println("Hai $firstName $lastName")
}

fun fullName(firstName: String, middleName: String, lastName: String){
    println("Hello $firstName $middleName $lastName")
}

//Vararg function

fun jumlahBilangan(name:String, vararg values: Int):Int{
    var i = 0
    for(value in values){
        i += value
    }
    return i
}

fun main() {
    var nilai1 = 32
    var nilai2 = 44
    println("Jumlah $nilai1 tambah $nilai2 = ${tambah(nilai1,nilai2)}")

//Function Named Argument
    fullName(
        firstName = "Muhammad",
        lastName = "Ni'am",
        middleName = "Choirun"

    )

//    Vararg function

    var result = jumlahBilangan("Niam", 10,10,10,10,12)
    println(result)
}