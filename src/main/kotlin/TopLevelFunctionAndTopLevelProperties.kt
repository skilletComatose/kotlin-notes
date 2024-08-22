package org.example


fun topLavelFunction(): Int  =  (0..100).random()

const val exmapleName = "kotlin";  //top level properties are properties that does not belong to clase
fun main() {

    println(filteredData { e -> e in 6..9 })
    val highttOrderFunction : (Int) -> Int = makeMultiPlier(2);

    println(highttOrderFunction(2))

}

fun  filteredData(filterFunction: (value: Int) -> Boolean ) : List<Int> {
    return (1..100)
        .filter { e -> filterFunction(e)}
        .toList()
}

fun  makeMultiPlier(factor: Int) : (Int) ->  Int {
    return { factor * 2 }
}