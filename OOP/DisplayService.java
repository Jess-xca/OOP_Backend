package OOP;

import java.util.List;

public class DisplayService {

    public static void showMenu() {
        System.out.println("\n\tWelcome to the Attendance System!!");
        System.out.println("\t---------------------------------\n");
        System.out.println("Please choose an option:");
        System.out.println("1. Add a student");
        System.out.println("2. Mark attendance");
        System.out.println("3. View attendance records");
        System.out.println("4. Exit");
    }

    public static void showAttendance(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        int count = 0;
        System.out.println("Attendance Records:");
        System.out.println("-------------------");
        for (Student student : students) {
            String status = student.isPresent() ? "Present" : "Absent";
            if (student.isPresent()) {
                count++;
            }
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName()
                    + ", Status: " + status + ", Course: " + student.getCourseName() + ", Count: " + count);
        }
        System.out.println("Total present students: " + count);
        double percentage = ((double) count / students.size()) * 100;
        System.out.println("Attendance Percentage: " + percentage + "%");
    }

    public static void showMessage(String message) {
        System.out.println(message);
    }
}
