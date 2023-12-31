package src.data

class Car(paramBrand: String, paramName: String, paramyear: Int = 2020) {
//    Fungsi init akan dijalankan saat class dipanggil
    init {
        println("$paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String): this(paramBrand, paramName,2021){
        println("Secondary constructor")
    }
    constructor(paramBrand: String): this(paramBrand,""){
        println("Secondary constructor 2")
    }
    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramyear
}