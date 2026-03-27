package OOP;

public class Student {
    String id;
    String name;
    boolean isPresent;
    String courseName;

    public Student() {
    }

    public Student(String id, String name, boolean isPresent, String courseName) {
        this.id = id;
        this.name = name;
        this.isPresent = isPresent;
        this.courseName = courseName;
    }
}
