package org.example

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
        override fun customValue(): String = "custom1"
    },

    TALKING {
        override fun signal() = WAITING
        override fun customValue(): String = "custom2"
    };

    abstract fun signal(): ProtocolState
    abstract fun customValue(): String
}


enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    TIMES {
        override fun apply(t: Int, u: Int): Int = t * u
    };

    override fun applyAsInt(t: Int, u: Int) = apply(t, u)
}

fun main() {

    println(Direction.WEST)
    println(ProtocolState.TALKING.customValue())
    println(IntArithmetics.PLUS.apply(2,2))
}