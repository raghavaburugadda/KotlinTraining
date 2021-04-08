package basics

fun main(args: Array<String>) {
    val sum = sum(14, 15, 30)
    println("Sum:$sum")

    //named arguments
    val area = calculateArea(breadth = 20, length = 10)
    println("area $area")

    val sumofarray = sumOfElements(*intArrayOf(1, 5, 7, 9))
    //print("sumofarray $sumofarray")

    val student = Student()
    println("is student passed: ${student.isPassed(50)}")
    student.isScholor(90)

    val myString = "Ramya"
    val validString = myString.containsLetterA(myString)
    println("validString: $validString")

    myString containsLetterB "Aswini"

    myString.containsLetterB("Ashwini")
}

fun add(marks1: Int, marks2: Int): Int {
    return marks1 + marks2
}

fun sum(marks1: Int, marks2: Int, sanskrit: Int = 50): Int {
    return marks1 + marks2 + sanskrit
}

fun calculateArea(length: Int, breadth: Int): Int {
    println("length $length")
    println("breadth $breadth")
    return length * breadth
}

 fun sumOfElements(vararg number: Int) {
    println("length: ${number.size}")
    for (i in number)
        println(i)
}

fun Student.isScholor(marks: Int): Boolean {
    return marks > 90
}

fun String.containsLetterA(myString: String): Boolean {
    return myString.contains("A")
}

/*1. all infix functions are extension functions
2. infix functions contains only 1 argument
*/
infix fun String.containsLetterB(myString: String): Boolean {
    return myString.contains("B")
}

class Student {

    fun isPassed(marks: Int): Boolean {
        return marks > 35
    }
}

