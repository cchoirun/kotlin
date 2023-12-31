fun main(){
    var firstName: String = "Muhammad"
    var middleName: String = "Choirun"
    var lastName: String = "Ni'am"
    var fullName: String = firstName + " " + middleName + " " + lastName
    var fullName2: String = "$firstName $middleName $lastName"
    var des: String = "Total charachter $firstName = ${firstName.length}"


    var alamat: String = """
        Ds. Woro RT 04 RW 04,
        Kecamatan Woro,
        Kabupaten Surabaya
    """.trimIndent()

    var alamat2: String = """
        |Ds. Woro RT 04 RW 04,
        |Kecamatan Woro,
        |Kabupaten Surabaya
    """.trimMargin()

    var alamat3: String = """
        <Ds. Woro RT 04 RW 04,
        <Kecamatan Woro,
        <Kabupaten Surabaya
    """.trimMargin("<")

    println(firstName)
    println(alamat)
    println(alamat2)
    println(alamat3)
    println(fullName)
}