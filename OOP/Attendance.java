package OOP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Attendance {

    static ArrayList<Student> students = new ArrayList<>();
    static Set<Student> set = new LinkedHashSet<>(students);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n\tWelcome to the Attendance System!!");
            System.out.println("\t---------------------------------\n");
            System.out.println("Please choose an option:");
            System.out.println("1. Add a student");
            System.out.println("2. Mark attendance");
            System.out.println("3. View attendance records");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    markAttendance();
                    break;
                case 3:
                    viewAttendance();
                    break;
                case 4:
                    System.out.println("Exiting the system....!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addStudent() {
        System.out.println("Enter the student's id:");
        String studentId = scanner.nextLine();
        for (Student s : students) {
            if (s.id.equals(studentId)) {
                System.out.println("Student ID " + studentId + " already exists.");
                return;
            }
        }
        System.out.println("Enter the student's name");
        String name = scanner.nextLine();
        System.out.println("Enter the students course name");
        String courseName = scanner.nextLine();

        students.add(new Student(studentId, name, false, courseName));
        System.out.println("Student added successfully!");
    }

    public static void markAttendance() {
        System.out.println("Enter the student's id:");
        String studentId = scanner.nextLine();
        for (Student student : students) {
            if (student.id.equals(studentId)) {
                student.isPresent = true;
                System.out.println("Attendance marked for " + student.name);
                return;
            }
        }
        System.out.println("Student not found.");

    }

    public static void viewAttendance() {
        if ((students.isEmpty())) {
            System.out.println("No students in the system.");
            return;
        }
        int count = 0;
        System.out.println("Attendance Records:");
        System.out.println("-------------------");
        for (Student student : students) {
            String status = student.isPresent ? "Present" : "Absent";
            System.out.println("Student ID: " + student.id + ", Name: " + student.name + ", Is Present: "
                    + status + ", Course Name: " + student.courseName);
            if (student.isPresent) {
                count++;
            }
        }
        System.out.println("Total present students: " + count);
        double percentage = ((double) count / students.size()) * 100;
        System.out.println("Attendance Percentage: " + percentage + "%");
    }

}
