fun main() {
    var names = arrayOf("Muhammad", "Choirun", "Ni'am")

//    Perulangan For
    for (name in names){
        println(name)
    }

    for(value in 0..100 step 3){
        print("$value ")
    }
    println("")
    val pjgName = names.size - 1

    for(i in 0..pjgName){
        println("indeks-$i = ${names.get(i)}")
    }

//    Perulangan While
    var i = 0
    while (i < 10){
        println("i = $i")
        i++
    }
    println("Sekarang Do-While")
    do{
        println("i = $i")
        i++
    }while (i < 12)

//    Break dan Continue
    println("-----Break dan Continue-----")
    while (true){
        println("i = $i")
        i++
        if (i > 100) break
    }

//    var k = 0..100

    for (k in 0..100){

        if(k % 2 == 0) continue
        println("k = $k")
    }
}