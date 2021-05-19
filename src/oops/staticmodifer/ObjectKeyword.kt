package oops.staticmodifer

import oops.inheritance.Animal

object ObjectKeyword:Animal() {
    var myVar1 = 10

    fun mystaticFun1() {
        println("static fun")
    }

    fun mystaticFun2() {
        println("static fun")
    }

    override fun eat() {
        super.eat()
    }
}