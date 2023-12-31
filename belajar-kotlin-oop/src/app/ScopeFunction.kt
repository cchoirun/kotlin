package src.app

import src.data.Student

fun main() {
    val student = Student("Niam",15)

    val student1: String = student.let {
        "ini ${it.name} dengan umur ${it.age}"
    }

    val student2: String = student.run {
        "ini ${this.name} dengan age ${this.age}"
    }

    val student3: Student = student.apply {
        "ini ${this.name} dengan age ${this.age}"
    }

    val student4: Student = student.also {
        "ini ${it.name} dengan age ${it.age}"
    }

    val student5: String = with(student){
        "ini ${this.name} with age ${this.age}"
    }

    println(student1)
    println(student2)
    println(student3)
    println(student4)
    println(student5)
}