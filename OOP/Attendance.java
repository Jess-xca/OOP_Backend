package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Attendance {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        AttendanceService service = new AttendanceService(students);

        boolean running = true;
        while (running) {
            DisplayService.showMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    DisplayService.showMessage("Enter the student's id:");
                    String studentId = scanner.nextLine();
                    DisplayService.showMessage("Enter the student's name:");
                    String name = scanner.nextLine();
                    DisplayService.showMessage("Enter the student's course name:");
                    String courseName = scanner.nextLine();
                    boolean added = service.addStudent(studentId, name, courseName);
                    DisplayService.showMessage(added ? "Student added successfully!" : "Student ID " + studentId + " already exists.");
                    break;
                case 2:
                    DisplayService.showMessage("Enter the student's id:");
                    String markId = scanner.nextLine();
                    String markedName = service.markAttendance(markId);
                    DisplayService.showMessage(markedName != null ? "Attendance marked for " + markedName : "Student not found.");
                    break;
                case 3:
                    DisplayService.showAttendance(service.getStudents());
                    break;
                case 4:
                    DisplayService.showMessage("Exiting the system....!");
                    running = false;
                    break;
                default:
                    DisplayService.showMessage("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
