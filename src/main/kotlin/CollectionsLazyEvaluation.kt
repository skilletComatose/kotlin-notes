package org.example

fun main() {
    // las secuancias son lazy ( similar a los stremas de java pero las livianos)
    //nota siempre que vaya usar encadenamiento con colecciones grandes
    val range = (1..1000_000_000)

    range.asSequence()
        .filter { it > 3 }
        .forEach(::println)

    //esta da error porque al ser una coleccion grande se queda sin memoria para hacer copias de datos
//    range.filter { it > 3 }
//        .forEach(::println)
}