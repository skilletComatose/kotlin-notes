package org.example

fun main() {
    val value = getRandom();
    value
        .let { duplicate(it) }
        .let { duplicate(it) }
        .let { println(it) }
    println("original value : $value")

    //example 2
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }
           .filter { it > 3 }
           .let { it.map { size -> duplicate(size) } }
           .let {println("example wit it $it")

        // and more function calls if needed
    }

}


fun getRandom(): Int {
    return (1..10).random();
}

fun duplicate(value : Int) : Int {
    return value * 2
}

fun addValue(value: Int , offset: Int ): Int {
    return value + offset;
}