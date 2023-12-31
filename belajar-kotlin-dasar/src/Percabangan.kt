fun main() {
    var nilai = 90
    var nilaiKode = 'A'
//    Percabangan IF

    if (nilai >= 90){
        println("Selamat dengan nilai $nilai kamu lulus")
    }else if(nilai >= 70){
        println("Dengan nilai $nilai, not bad lah ya")
    }else{
        println("Hayya! Coba lagi loh")
    }


// Percabangan When

//    1. When biasa (pengganti switch-case)
    when(nilaiKode){
        'A'-> println("Wah kamu dapat $nilaiKode, selamat")
        'B'-> println("Dapet B, lumayan lah")
        'C','D','E' -> println("Ayoyoyo!, kamu dapet $nilaiKode")
        else-> println("Coba lagi")
    }

//    2. When buat rentang array
    val indeksLulus: Array<Char> = arrayOf('A','B','C')
    when(nilaiKode){
        in indeksLulus -> println("Wah nilai $nilaiKode, kamu Lulus")
        !in indeksLulus -> println("Nggak dulu ya!")
    }

//    3. When untuk mengecek tipe data
    when (nilaiKode){
        is Char -> println("Bener! $nilaiKode merupakan char")
        !is Char -> println("Bukan char!")
    }

//    4. When untuk menggantikan If-Else
    when{
        nilaiKode == 'A' -> println("Bener, nilaimu A")
        nilai >= 70 -> println("Wih, gede ya")
    }
}