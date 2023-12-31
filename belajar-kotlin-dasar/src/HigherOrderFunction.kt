//Ketika kita ingin menggunakan lambda sebagai parameter

fun sayHello(name: String, transform: (String)->String) : String{
    val result = transform(name)
    return "Hello $result"
}

//Namun terkadang kita butuh buat jadi inline, biar tidak overflow saat dicompile

inline fun sayHelloFull(firstName: String,
                 middleName: String,
                 noinline transform: (String)->String) : String{
    val result = transform(firstName)
    return "Hello $result"
}

fun main() {
val transformLambda = {firstName: String ->
    firstName.uppercase()
}

    println(sayHello("Ni'am",transformLambda))


//    Anonymous function
    val sayhello = fun(name: String){
        println("Halo $name")
    }

    sayhello("nunu")
}