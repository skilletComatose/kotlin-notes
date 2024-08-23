package org.example

inline fun calculate(a: Int, b: Int, opt: (Int, Int) -> Int): Int {
    return opt(a, b)
}

fun main() {

    //si la lambda es el ultimo argumento se puede sacar del parentesis
    println(
        calculate(2, 3) { value1, value2 -> value1 * value2 }

    )
}