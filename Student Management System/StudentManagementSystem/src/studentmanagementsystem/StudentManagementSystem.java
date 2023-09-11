
package studentmanagementsystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Anjula
 */
public class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(String studentId) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentId().equals(studentId)) {
                iterator.remove();
                System.out.println("Student with ID " + studentId + " has been deleted.");
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    public void displayAllStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student.getStudentInfo());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.next();
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    System.out.println("Select student type:");
                    System.out.println("1. Undergraduate");
                    System.out.println("2. Graduate");
                    int studentTypeChoice = scanner.nextInt();
                    if (studentTypeChoice == 1) {
                        System.out.print("Enter major: ");
                        String major = scanner.next();
                        system.addStudent(new UndergraduateStudent(studentId, name, age, major));
                    } else if (studentTypeChoice == 2) {
                        System.out.print("Enter research area: ");
                        String researchArea = scanner.next();
                        system.addStudent(new GraduateStudent(studentId, name, age, researchArea));
                    }
                    break;
                case 2:
                    System.out.print("Enter student ID to delete: ");
                    String idToDelete = scanner.next();
                    system.deleteStudent(idToDelete);
                    break;
                case 3:
                    system.displayAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting Student Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}