package src.data

class Address {
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

//    Secondary constructor tanpa primary constructor
    constructor(paramStreet: String, paramCity: String){
        street = paramStreet
        city = paramCity
    }
    constructor(paramStreet: String, paramCity: String, paramCountry: String): this(paramStreet,paramCity){
        country = paramCountry
    }
}