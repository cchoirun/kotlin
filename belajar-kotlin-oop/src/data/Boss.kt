package src.data

class Boss(val name: String) {

    inner class Employee(val name: String){
        fun hi(){
            println("Hello, my name is $name, and my boss is ${this@Boss.name}")
        }
    }
}