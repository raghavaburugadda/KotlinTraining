package javaoops;

public class JavaOOPS {

    public static void main(String[] args) {
        JavaStudent javaStudent1 = new JavaStudent();
        javaStudent1.setjStudentName("Aswini");
        javaStudent1.setjStudentID(2);

        JavaStudent javaStudent2 = new JavaStudent();
        javaStudent2.setjStudentName("Aswini");
        javaStudent2.setjStudentID(2);


        String string1 = "A";
        String string2 = "A";

        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("True");
        }

        if (javaStudent1.equals(javaStudent2)) {
            System.out.println("student True");
        } else {
            System.out.println("student false");
        }

        if (javaStudent1 == javaStudent2) {
            System.out.println("student True");
        } else {
            System.out.println("student false");
        }
    }
}
