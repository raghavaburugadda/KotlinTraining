package basics

fun main(args: Array<String>) {
    val expressions = Expressions()
    expressions.loops()
}


class Expressions {

    // we have to use ".." to define range
    fun ranges() {
        val myRange = 1..10 // count from 1 to 10
        for (i in myRange)
            print(i)

        println()
        val descendingRange = 10 downTo 1 // Decrement counter
        for (j in descendingRange)
            print(j)

        println()
        val myMarks = 40
        val marksRange = 1..50
        // "in" operator is used to compare value within the range
        if (myMarks in marksRange) {
            println("I passed")
        } else {
            println("I failed")
        }

        println()
        // My counter is 1,2,3,4..10   i have to skip 2,4,6
        // Each and every value is a step if u say two means it will skip one value similarly others.
        val myRequiredRange = myRange step 2
        for (i in myRequiredRange)
            print(i)
    }

    fun conditionalStatements() {
        val num1 = 6
        val num2 = 8
        val greaterValue: Int = getGreaterNumber(num1, num2)
        val expGreaterValue: Int = if (num1 > num2) {
            num1
        } else {
            num2
        }

        when (num1) {
            0, 1 -> {
                println("Dummy")
                println("Value is 0 or 1")
            }
            2, 3 -> println("Value is 2 or 3")
            else -> {
                println("Value is none of the above")
            }
        }

        var myValude: String = when (num1) {
            in 1..10 -> {
                "My range is between 1 to 10"
            }

            in 50 downTo 40 -> {
                println()
                "My range is between 40 to 50"
            }
            else -> {
                "My range is out of range"
            }
        }


    }

    fun loops() {
        myLoop@for (i in 1..3) {
            for (j in 1..3) {
                println("$i  $j")
                if (i == 2 && j == 2)
                    break@myLoop
            }
        }
    }


    fun getGreaterNumber(num1: Int, num2: Int): Int {
        if (num1 > num2) {
            return num1
        } else {
            return num2
        }
    }
}