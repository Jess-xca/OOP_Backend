package OOP;

public class Student {
    String id;
    String name;
    boolean isPresent;
    String courseName;

    public Student(String id, String name, boolean isPresent, String courseName) {
        this.id = id;
        this.name = name;
        this.isPresent = isPresent;
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
