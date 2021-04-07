package basics

fun main(args: Array<String>) {
    displayDummy("Raghava")
    val myTrainees=TrainingBatch()
    myTrainees.displayMarksOfStudent()
}

fun displayDummy(name: String) {
    println("Your name: $name")
}


class TrainingBatch {
    var sName: String = ""
    var sMarks: Int = 0;

    fun displayMarksOfStudent() {
        println("$sName Marks are $sMarks")
    }

    fun modifyMarks(marks: Int): Int {
        return marks + sMarks
    }

    fun displayMarks(marks: Int) {
        println("Modifed marks $marks")
    }

    fun stringLiterrals() {
        var myString = "Aswhini"
        println("Name of my student is $myString and her string length is ${myString.length}")
        var num1 = 5
        var num2 = 6
        println("Sum of $num1 and $num2 is ${num1 + num2}")
    }

}