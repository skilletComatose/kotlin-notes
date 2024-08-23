package org.example


fun main() {
    var a = "Hello"
    var b = a
    var c = "world"
    var d = "world"

    println("a === b : ${a === b}") // true

    println("a === c :${a === c}") // false

    /**
     * En este caso, tanto c como d contienen el mismo literal "world".
     * Kotlin utiliza una optimización conocida como interning para los literales de cadenas.
     * Esto significa que las cadenas literales idénticas pueden compartir la misma posición
     * en la memoria para ahorrar espacio.
     *
     * */
    println("c === d : ${c === d}")  // true, acá da true porque kt usa interning  pata las cadenas literales


}

