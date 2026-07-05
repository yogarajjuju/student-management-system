package com.studentmanagement.app;

import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentService;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        // Create Students
        Student student1 = new Student(1, "Rahul", 20, "AI&DS");
        Student student2 = new Student(2, "Priya", 21, "IT");

        // Add Students
        service.addStudent(student1);
        service.addStudent(student2);

        // Display Students
        System.out.println("===== BEFORE UPDATE =====");

        for (Student student : service.getAllStudents()) {
            System.out.println(student);
        }

        // Update Student
        Student updatedStudent = new Student(2, "Priya Sharma", 22, "CSE");

        boolean updated = service.updateStudent(updatedStudent);

        if (updated) {
            System.out.println("\nStudent updated successfully!");
        } else {
            System.out.println("\nStudent not found!");
        }

        // Display After Update
        System.out.println("\n===== AFTER UPDATE =====");

        for (Student student : service.getAllStudents()) {
            System.out.println(student);
        }

        // Delete Student
        boolean deleted = service.deleteStudent(1);

        if (deleted) {
            System.out.println("\nStudent deleted successfully!");
        } else {
            System.out.println("\nStudent not found!");
        }

        // Display After Delete
        System.out.println("\n===== AFTER DELETE =====");

        for (Student student : service.getAllStudents()) {
            System.out.println(student);
        }
    }
}