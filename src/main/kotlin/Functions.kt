package org.example



fun main() {
    println(double(2))
    println(
        withDefaultParamAndNamedArguments(
            wordSeparator = 'ñ'
        )
    )

    println(customAsList("e-1", "e-2"))

    println("tail Recursive ${findValue("1")}")
    println("Factorial ${factorial(4)}")
}

fun double(x: Int): Int {
    return x * 3
}

fun withDefaultParamAndNamedArguments(
    str: String = "2",
    normaliceCase: Boolean = true,
    wordSeparator: Char = '_'
) {
    println("$str, $normaliceCase, $wordSeparator")
}

// multiple args
fun <T> customAsList(vararg ts: T): List<T> {
    return listOf(*ts);
}

/*
 en la recursion en cola la llamada recursiva debe ser la ultima operacion
 */
val eps = 10;
tailrec fun findFixPoint(x: Double = 1.0): Double =
    if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))


tailrec fun findValue(str: String): String =
    if (str.length == 5) str else findValue("$str#")

fun  factorial(n:Int) : Int {
    return if (n <= 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

