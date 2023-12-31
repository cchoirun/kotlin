package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()

    mutableList.add("Muhammad")
    mutableList.add("Choirun")
    mutableList.add("Ni'am")

//    mutableList[0] = "niam"
    for(value in mutableList){
        println(value)
    }
}