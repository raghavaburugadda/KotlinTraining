import java.util.Arrays;

public class SampleJavaClass {

    public static void main(String[] args) {
        String name = "ramya";
        name = null;
        System.out.println("length:" + name.length());

        Object myobj = "Ashwini";
        if (myobj instanceof String) {
            String myString = (String) myobj;
        }
        String[] myArray = new String[]{};

    }


}

