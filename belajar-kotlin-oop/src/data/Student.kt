package src.data

class Student(val name: String, val age: Int) {
}

fun Student?.sayHello(name: String){
    if(this != null){
        println("Hello $name, this is ${this.name}, and my age is ${this.age}")
    }
}

val Student.upperName: String
    get() {
        return this.name.uppercase()
    }