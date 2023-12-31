fun main(){

//    Number

    var angka: Byte = 12
    var desimal:Float = 13.4F  //Harus dikasih F supaya dia dianggap Float, bukan Double
    var dobel: Double = 144.3
    var angkaInt: Int = 3452
    var angkaLong: Long = 134521L

//    Literals
    var numInt: Int = 1231
    var numHexa: Int = 0xFF
    var numBiner: Int = 0b01010101

    println(numBiner)

//    Conversions
    var numConvert: Int = 120
    var numtoByte: Byte = numConvert.toByte()
    var numtoLong: Long = numConvert.toLong()

//    Undescore : Untuk memudahkan pembacaan
    var angkaPanjang: Int = 12_345_425
    println(angkaPanjang)

}