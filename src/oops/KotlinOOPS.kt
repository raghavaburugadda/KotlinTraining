package oops

import oops.inheritance.Dog
import oops.interfaces.KotlinTrainees
import oops.interfaces.Trainer
import oops.specialclasses.IndianTeam
import oops.specialclasses.StudentDataClass
import oops.specialclasses.StudentNormalClass

fun main(args: Array<String>) {
    val string1 = "A"
    val string2 = "A"

    //it is going to compare values
    if (string1 === string2) {
        println("True")
    } else {
        println("False")
    }
}

fun dataclassExample() {
    val myStudent1: StudentDataClass = StudentDataClass(
        "Raghava"
        , "150"
        , "A"
        , 2
    )
    val myStudent2: StudentDataClass = StudentDataClass(
        "Raghava"
        , "150"
        , "A"
        , 40
    )

    val myStudent3 = myStudent2.copy(studentRollNumber = 55)

    val myOldStudent1 = StudentNormalClass(
        "RRR"
        , "250"
        , "A"
        , 44
    )
    println(myStudent3.toString())
    println(myOldStudent1.toString())
}

fun interfacesExample() {
    val kotlinTrainer = Trainer("Raghava")
    val kotlinTraineeList = getTrainees("Ashwini", "Ramya")
    val kotlinContent = "Kotlin video"
    val kotlinTrainees = KotlinTrainees()

    kotlinTrainer.startTraining(
        kotlinTrainees
        , kotlinTraineeList
        , kotlinContent
    )

}

fun getTrainees(vararg studentList: String): ArrayList<String> {
    val traineesList = ArrayList<String>()
    for (student in studentList)
        traineesList.add(student)
    return traineesList
}

fun inheritance() {
    val dog: Dog = Dog("White", "Doberman")
    dog.bark()
    val indianTeam = IndianTeam()
    indianTeam.matches()
}

fun classesConstructorExample() {
    val kotlinClass = KotlinClass("Aswini")
    kotlinClass.studentName = "Ramya"
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

