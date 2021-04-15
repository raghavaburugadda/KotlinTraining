package oops

class KotlinClass(var name: String) {

    var studentName: String = ""
    var studentID: Int = 0;
    var stuentMarks: Int = 0

    lateinit var myPercentage: String

    var studentPercentage: Double = 0.0
        set(defaultMarks) {
            field = (stuentMarks + defaultMarks)
        }
        get() {
            field = (field / 100) * 100
            return field
        }


    init {
        println("init block executed")
    }

    constructor(name: String, id: Int) : this(name) {
        this.studentName = name
        this.studentID = id;
    }

    constructor(name: String, id: Int, marks: Int) : this(name) {
        this.studentName = name
        this.studentID = id;
        this.stuentMarks = marks
        myPercentage = (stuentMarks/100).toString();
    }
}