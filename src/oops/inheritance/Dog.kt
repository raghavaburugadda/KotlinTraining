package oops.inheritance

class Dog : Animal {
    var breed: String = ""

    constructor(dogColor: String, breed: String) : super(dogColor) {
        this.breed=breed
    }

    fun bark() {
        println("Dog color is $color")
        println("Dog breed is $breed")
        println("dog is barking")
    }

    override fun eat() {
        //super.eat()
        println("Dog is eating cat")
    }

}