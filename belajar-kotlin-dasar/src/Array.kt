fun main() {
//    Array
    val array1 : Array<String> = arrayOf("Muhammad", "Choirun", "Ni'am")
    val arrayNum: Array<Int> = arrayOf(3_000, 56_000, 788)

    val arrayKu: Int = arrayNum.get(0)

    println(arrayNum[0])
    println(arrayKu)
    arrayNum.set(0,456)
    println(arrayNum[0])

//    Array Nullable
    val arrayKosong: Array<String?> = arrayOfNulls(5)
    arrayKosong[0] = "budi"
    println(arrayKosong[0])
}