import java.util.*;

public class CollectionJava {
    private String name;
    private int id;

    public CollectionJava(String _name) {
        name = _name;
    }

    public CollectionJava(String _name, int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        listImplementation();
        setImplementation();
        mapImplementation();
    }

    public static void listImplementation() {
        List<JavaStudent> myStudentList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            JavaStudent javaStudent = new JavaStudent("Student" + i,
                    i);
            myStudentList.add(javaStudent);
        }
        System.out.println("MyListSize:" + myStudentList.size());

        //.size() will give us number of insertions
        for (int i = 0; i < myStudentList.size(); i++) {
            JavaStudent javaStudent = myStudentList.get(i);
            System.out.println("StudentID:" + javaStudent.getId()
                    + "," + "StudentName:" + javaStudent.getName());
        }

        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");
        myList.add("F");
        myList.add("E");
        myList.add("F");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        List<Object> myList1 = new ArrayList<>();
        myList1.add("RRR");
        myList1.add(2);

        for (int i = 0; i < myList1.size(); i++) {
            Object obj = myList1.get(i);
        }


    }

    public static void setImplementation() {
        Set<String> myStrings = new HashSet<String>();
        myStrings.add("A");
        myStrings.add("B");
        myStrings.add("C");
        myStrings.add("D");
        myStrings.add("E");
        myStrings.add("F");
        myStrings.add("E");
        myStrings.add("F");

        System.out.println("**** SET DATA *****");
        Iterator<String> myiterator = myStrings.iterator();
        while (myiterator.hasNext()) {
            System.out.println(myiterator.next());
        }
    }

    public static void mapImplementation() {
        Map<String, JavaStudent> myStudents = new HashMap<>();
        JavaStudent ashwini = new JavaStudent("ashwini", 1);
        JavaStudent raghava = new JavaStudent("raghava", 2);
        JavaStudent ramya = new JavaStudent("ramya", 3);

        myStudents.put("aswini", ashwini);
        myStudents.put("raghava", raghava);
        myStudents.put("ramya", ramya);

        System.out.println("Mystundent:" + myStudents.get("aswini").getId());

        Set<String> myKeys = myStudents.keySet();
        Iterator<String> myiterator = myKeys.iterator();
        while (myiterator.hasNext()) {
            System.out.println(myStudents.get(myiterator.next()).getName());
        }

    }

}
