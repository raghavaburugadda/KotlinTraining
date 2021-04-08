public class JavaStudent {

    private String name;
    private int id;

    public JavaStudent(String _name, int _id) {
        name = _name;
        id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
