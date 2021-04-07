package basics

fun main(args: Array<String>) {

    val myStringArray = arrayOf("Ramya", "Ashwini", "Raghava")
    var myIntegerArray = intArrayOf(1, 4, 5, 6)


    var myNullableArray = arrayOfNulls<Number>(5)
    myNullableArray[0] = 1;
    for (name in myNullableArray)
        println(name)

    // Primitive part
    val myPrimitiveArrays = IntArray(3) { i -> i }
    for (num in myPrimitiveArrays)
        println(num)

}