fun main() {
    val fungsiLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "Halo $firstName $lastName"
        result
    }

    println(fungsiLambda("Choirun", "Ni'am"))

//    Kalau parameter cuma 1, bisa langsung pakai "it"

    val sayHello: (String) -> String = {

        "Hallo $it"
    }

    println(sayHello("Niam"))

//    Kita juga bisa menghubungkan ke fungsi yang sudah ada

    fun panggil(firstName: String): String = "Hallo $firstName"

    val panggilFungsi: (String) -> String = ::panggil

    println("Dari panggil = ${panggilFungsi("Niam")}")

}