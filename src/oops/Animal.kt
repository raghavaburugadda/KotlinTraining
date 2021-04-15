package oops

open class Animal() {
    var color: String = ""

    constructor(color: String) : this() {
        this.color = color
    }

    open fun eat() {
        println("Animal is eating")
    }
}