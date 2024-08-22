package org.example


fun main() {
    var customer: String = "SOY el string"
    val data = listOf("hola", "como", "estas madafaka")
    val dat2 = data.filter { value -> value.length > 5 }
        .map { element -> element.uppercase() }
    println("Hello for kotlin : $dat2")

    println(exmapleName)
    println(topLavelFunction())
}