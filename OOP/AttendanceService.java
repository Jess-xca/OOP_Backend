package OOP;

import java.util.List;

public class AttendanceService {

    private List<Student> students;

    public AttendanceService(List<Student> students) {
        this.students = students;
    }

    public boolean addStudent(String studentId, String name, String courseName) {
        for (Student s : students) {
            if (s.getId().equals(studentId)) {
                return false;
            }
        }
        students.add(new Student(studentId, name, false, courseName));
        return true;
    }

    public String markAttendance(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                student.setPresent(true);
                return student.getName();
            }
        }
        return null;
    }

    public List<Student> getStudents() {
        return students;
    }
}
