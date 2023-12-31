package src.app

import src.data.BigNote
import src.data.Note

fun main() {
    val note = Note("Naruto")
    println(note.title)
    note.title = ""
    println(note.title)


    val bignote = BigNote("ini naruto")
    println(bignote.title)
    println(bignote.bigTitle)
}