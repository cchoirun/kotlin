package src.data

interface Interaction {
    val name: String
    fun sayHello(name: String)
}

interface Go: Interaction{
    fun go(){
        println("Go")
    }
}

interface MoveA{
    fun move() = println("Move A")
}

interface MoveB{
    fun move() = println("Move B")
}


// Class boleh menerima lebih dari 1 interface parent, tapi cuma 1 class parent

class Human(override var name: String) : Go, MoveA, MoveB{
    override fun sayHello(name: String){
        println("Hai $name, this is ${this.name}")
    }

    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
}