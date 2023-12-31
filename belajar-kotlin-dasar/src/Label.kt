//Label digunakan saat perulangan agar dapat mudah dibreak




fun main() {
    labelI@ for (i in 1..10){
        labelJ@ for (j in 1..10){
            if (j > 7) break@labelJ
            println("$i * $j = ${i*j}")
        }
    }
}