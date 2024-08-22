package org.example

// genera un singlenton
val helloWorld = object  {
    val name = "carlos"
    var age = 22
    val gender = "M"
    override fun toString(): String {
        return "Name: $name, Age: $age, Gender: $gender"
    }
}


// genera un singlenton
data object CustomAnonymusDataObject {
    val name: String  = "Daniel"
    val age = 22
}


fun main() {
    println(helloWorld)
    println(CustomAnonymusDataObject.age)
    println(CustomAnonymusDataObject.name)
}