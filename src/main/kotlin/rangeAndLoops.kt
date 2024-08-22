package org.example


fun main() {
   val range: IntRange = 1..10;
   val reverseRange =  10  downTo 1;


    val result = range.map { v -> v * 2 }
       .filter { e -> e > 4 }

   println("range  $result")
   println("Reverse range ${reverseRange.toList()}")
}