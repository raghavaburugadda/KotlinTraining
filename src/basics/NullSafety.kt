package basics

import java.lang.StringBuilder

fun main(args: Array<String>) {
    // Non-nullable variable
    var myName: String = "Ramya"
    println("${myName.length}")

    var myNickName: String? = "Ashwini"
    println("${myNickName?.length}")

    //Elvis operator
    var nickNameLength = myNickName?.length ?: -1
    println("$nickNameLength")

    //Non-null operator
    print("The length is:${myNickName!!.length}")

    //Concatination of Strings
    var myConcatName = myName.plus(myNickName)
    var myBuilder: StringBuilder = StringBuilder();
    myBuilder.append(myName)
    myBuilder.append(myNickName)
    println(myBuilder.toString())


}