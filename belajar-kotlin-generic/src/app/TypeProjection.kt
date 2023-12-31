package app

class Container<T>(var data : T)

fun copyContainer(from: Container<out Any>, to: Container<in Any>){
    to.data = from.data
}

fun main() {
    val container1 = Container("Niam")
    val container2: Container<Any> = Container("Muhammad")

    copyContainer(container1, container2)
}