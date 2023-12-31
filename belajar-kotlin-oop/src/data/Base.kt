package src.data

interface Base {
    fun sayHello(name: String)
    fun sayGoodbye(name: String)
}

class MyBase: Base{
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Bye $name")
    }
}

class MyBaseDelegate(val base: Base) : Base by base

// Class di atas sudah mengambil nilai MyBase, namun bisa di override