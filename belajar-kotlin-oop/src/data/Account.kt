package src.data

class Account {
    val name: String by lazy {
        println("Nama dipanggil")
        "Niam"
    }
}