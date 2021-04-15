package oops

fun main(args: Array<String>) {

    //By using primary constructor
    val kotlinClass = KotlinClass("Aswini")
    kotlinClass.studentName="Ramya"
    println("${kotlinClass.name}")

    val kotlinclass2 = KotlinClass("Aswini", 1, 60)
    println("${kotlinclass2.studentName}")
    println("${kotlinclass2.studentID}")
    println("${kotlinclass2.stuentMarks}")

    val myKotlinStudent = KotlinClass("Ashwini", 1, 60);
    myKotlinStudent.studentPercentage = 3.0
    println("Percentage is: ${myKotlinStudent.studentPercentage}")
    println("My Percentage is: ${myKotlinStudent.myPercentage}")
}

