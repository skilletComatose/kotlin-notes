package org.example

data class PersonClass(val name:String, val age:Int)


fun main() {
    //por defecto trae el equals, toString,  hashCode, copy
    val data = PersonClass(name = "Carlos", age = 12)
    var data2 = data.copy(age = 22)

    val (name, age) = data2;
    //puedo hacer desestructuracion de objetos
    println("data: $data")
    println("data2 :$data2")
    println("ejemplo con $name con $age")
}