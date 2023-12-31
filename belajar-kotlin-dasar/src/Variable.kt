const val APPLICATION = "Belajar Kotlin Dasar"
const val  VERSION = "0.0.2"


fun main(){

    val nama: String = "Muhammad"
    val bolehNull: String? = null

    println(bolehNull)
    println(bolehNull?.length) //Harus ada tanda tanya
    println("$APPLICATION = $VERSION")
}