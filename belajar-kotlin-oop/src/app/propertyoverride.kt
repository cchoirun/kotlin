package src.app

import src.data.Rectangle
import src.data.Shape
import src.data.Triangle

fun main() {
    val shape = Shape()
    val rectangle = Rectangle()
    val triangle = Triangle()

    println(shape.corner)
    println(rectangle.corner)
    println(triangle.corner)
}