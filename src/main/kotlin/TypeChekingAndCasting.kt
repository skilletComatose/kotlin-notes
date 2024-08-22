
package org.example

fun main() {
    val name = "Carlos" as String;
    val x: Any = "HOLA" as Any
    when (x) {
        is Int -> print(x + 1)
        is String -> print("SOY un STRING")
        is IntArray -> print(x.sum())
    }
    println(2 is Int)
}