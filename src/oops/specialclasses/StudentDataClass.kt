package oops.specialclasses

import oops.inheritance.Animal

data class StudentDataClass(
    val studentName: String
    , val studentMarks: String
    , val studentSection: String
    , val studentRollNumber: Int
) : Animal() {
    val studentGirlFriend: String = ""
    fun percentage() {

    }

}