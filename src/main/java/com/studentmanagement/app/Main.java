package com.studentmanagement.app;

import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentService;
import com.studentmanagement.util.DatabaseInitializer;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println(" Student Management System");
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {

                case 1:

                    try {

                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Department: ");
                        String department = scanner.nextLine();

                        Student student = new Student(id, name, age, department);

                        service.addStudent(student);

                        System.out.println("\n✅ Student added successfully!");

                    } catch (IllegalArgumentException e) {
                        System.out.println("❌ " + e.getMessage());
                    }

                    break;

                case 2:

                    List<Student> students = service.getAllStudents();

                    if (students.isEmpty()) {
                        System.out.println("\nNo students found.");
                    } else {

                        System.out.println("\n===== Student List =====");

                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }

                    break;

                case 3:

                    try {

                        System.out.print("Enter Student ID to Update: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter New Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter New Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter New Department: ");
                        String department = scanner.nextLine();

                        Student updatedStudent =
                                new Student(id, name, age, department);

                        boolean updated = service.updateStudent(updatedStudent);

                        if (updated) {
                            System.out.println("\n✅ Student updated successfully!");
                        } else {
                            System.out.println("\n❌ Student not found.");
                        }

                    } catch (IllegalArgumentException e) {
                        System.out.println("❌ " + e.getMessage());
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();

                    boolean deleted = service.deleteStudent(deleteId);

                    if (deleted) {
                        System.out.println("\n✅ Student deleted successfully!");
                    } else {
                        System.out.println("\n❌ Student not found.");
                    }

                    break;

                case 5:

                    System.out.println("\nThank you for using Student Management System!");
                    break;

                default:

                    System.out.println("\n❌ Invalid choice!");
            }

        } while (choice != 5);

        scanner.close();
    }
}