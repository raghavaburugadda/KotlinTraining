package javaoops;

public class JavaStudent extends Student{
    private String jStudentName;
    private int jStudentID;
    public static int myID;

    public JavaStudent() {

    }

    public static void myMethod()
    {

    }

    public JavaStudent(String _jStudentName) {
        this.jStudentName = _jStudentName;
    }

    public JavaStudent(int _jStudentID) {
        this.jStudentID = _jStudentID;
    }

    public JavaStudent(String _jStudentName, int _jStudentID) {
        this.jStudentName = _jStudentName;
        this.jStudentID = _jStudentID;
    }

    public String getjStudentName() {
        return jStudentName;
    }

    public void setjStudentName(String jStudentName) {
        this.jStudentName = jStudentName;
    }

    public int getjStudentID() {
        return jStudentID;
    }

    public void setjStudentID(int jStudentID) {
        this.jStudentID = jStudentID;
    }

    @Override
    public void studentPercentage() {

    }
}
