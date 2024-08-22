package org.example

class Person(val name: String = "defaultName") {
    fun doStuff( ) {
        println("im walking")
    }
}

//primary constructor ( usar este siempre que sea posible)
/**
 * las propiedades que no se les coloca el private son publicas
 * para que una clase pueda heredar se le coloca el open
 * */
open class Vehicle(var name: String) {
        init {
            println("se puede usar to ejecutar alguna logica de inicialización")
        }
}

//constructor secundario
class Car(carName: String) : Vehicle(carName) {
    private var numberPlate: String = "";

    constructor(name: String, numberPlate: String ) : this(name) {
        this.name = name;
        this.numberPlate = numberPlate;
    }

}

class Rectangle(private var _width: Int, private var _height: Int) {


    //getters
    val area: Int get() = this._width * this._height;

    // getter y setter
    var width: Int
            get() {return _width}
            set(value) { _width = value}
}

fun main() {
    val p = Person();
//    val p2 = Vehicle("Mazda")
    val car = Car("Toyota", "CX-232")
    var rectangle : Rectangle = Rectangle(22,22)




    println("Person : ${p.name}")
    println(car.name)
    p.doStuff()


}