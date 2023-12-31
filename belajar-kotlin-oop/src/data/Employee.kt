package src.data

open class Employee(val name: String) {
    open fun sayHello(name:String) {
        println("Hello $name, my name is ${this.name}")
    }

}

class Manager(name: String) : Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }
}
class VicePresident(name: String) : Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name, my name is vicePresident ${this.name}")
    }
}