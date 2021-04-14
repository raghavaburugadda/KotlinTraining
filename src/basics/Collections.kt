package basics

fun main(args: Array<String>) {
    // Read-Only Operations
    val myList = listOf<String>("Ashwini", "Ramya", "Raghava")
    val myList1 = listOf("Ashwini", "Ramya", "Raghava")
    for (i in myList) {
        println(i)
    }

    val myHetroList = listOf<Any>("Ashwini", 1, "Ramya", 2, "Raghava", 3)
    for (i in myHetroList) {
        if (i is Int)
            println("true")
        else
            println("false")
    }

    // Mutable List

    val myMutableList = mutableListOf<String>("Ashwini")
    myMutableList.add("Ramya")
    myMutableList.add(1, "Raghava")

    val myArrayMutableList = arrayListOf<Int>(4, 5, 7, 8)
    myArrayMutableList.clear()

    //
    val mySet = setOf("A", "B", "C")
    val myIterator = mySet.iterator()
    while (myIterator.hasNext())
        println(myIterator.next())

    for (i in mySet) {
        println(i)
    }

    val myLinkedHashSet = linkedSetOf<Int>(2, 1, 8, 5, 6)
    val myIterator1 = myLinkedHashSet.iterator()
    while (myIterator1.hasNext())
        println(myIterator1.next())
}
