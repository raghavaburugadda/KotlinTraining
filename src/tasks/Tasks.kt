package tasks

fun main(args: Array<String>) {
    //print1to10InOrder()
    printMultiDimensionalArray()
}

fun print1to10InOrder() {
    for (i in 1..15) {
        if (i in 1..5 || i in 11..15)
            print("$i ")
        else {
            println("$i")
        }
    }
}

fun printMultiDimensionalArray() {
    //Using arrayof method
    println("Using arrayof method")
    var arr = arrayOf(
        intArrayOf(1, 2, 3), intArrayOf(4, 5, 6)
        , intArrayOf(7, 8, 9)
    )

    for (myrow in arr) {
        println(myrow.contentToString())
    }


    // Using Array constructor
    println("Using Array constructor")
    val rows = 3
    val columns = 4
    val myArray = Array(rows) { IntArray(columns) }
    for (row in myArray) {
        println(row.contentToString())
    }

    println("Using Array constructor but dynamic values")
    val numOfRows = 3
    val numOfColumns = 4
    val myDynamicArray = Array(numOfRows) { r -> IntArray(numOfColumns) { c -> r + c } }

}