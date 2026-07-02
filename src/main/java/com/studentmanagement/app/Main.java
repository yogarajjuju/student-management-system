package com.studentmanagement.app;

import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentService;

public class Main {

    public static void main(String[] args) {

        // Create Service
        StudentService service = new StudentService();

        // Create Students
        Student student1 = new Student(1, "Rahul", 20, "AI&DS");
        Student student2 = new Student(2, "Priya", 21, "IT");

        // Add Students
        service.addStudent(student1);
        service.addStudent(student2);

        // Display All Students
        System.out.println("\n===== STUDENTS =====");

        for (Student student : service.getAllStudents()) {
            System.out.println(student);
        }
    }
}