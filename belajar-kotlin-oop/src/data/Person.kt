package src.data

class Person (var firstName: String = "",
              var middleName: String? = null,
              var lastName: String = ""){


    fun sayHello(name:String){
        println("Halo $name, nama saya $firstName")
    }

//    Function overloading: fungsi dengan nama sama boleh, tapi param harus beda
    fun sayHello(firstName:String, lastName: String){
        println("Halo $firstName $lastName, nama saya ${this.firstName}")
    }

    fun run(){
        println("I'm Run!")
    }

    fun fullName(): String{
        return "$firstName $middleName $lastName"
    }
}