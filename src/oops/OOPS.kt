package oops

fun main(args: Array<String>) {
    val student = Student("Ashwini")
    student.studentName = "Ramya"

    val teacher = Teacher("Raghava")
    teacher.teacherName = "ashwini";

    val myteacher = Teacher("RRR", 50)
    println("my teacher subject: ${myteacher.teacherSubject}")

    val getterSetterDemo = GetterSetterDemo()
    getterSetterDemo.myStudentMarks = 10
    println("marks ${getterSetterDemo.myStudentMarks}")
}

// one way of creation
class Student constructor(name: String) {
    var studentName: String = ""
    val studentID: Int = 0

    init {
        studentName = name
        print("student name $studentName")
    }
}

class Teacher(var teacherName: String) {

    var teacherID: Int = 0
    lateinit var teacherSubject: String

    constructor(teachName: String, teacherID: Int) : this(teachName) {
        this.teacherID = teacherID
        teacherSubject="Maths"
    }

    fun changeMyTeacherSubject(subject: String) {
        teacherName = "Ashwini"
    }
}

class GetterSetterDemo {
    var myStudentMarks: Int = 0
        get() {
            println("getter executed")
            return field
        }
        set(value) {
            field = when {
                value < 18 -> 18
                value in 1..5 -> value
                else -> value
            }
        }


}