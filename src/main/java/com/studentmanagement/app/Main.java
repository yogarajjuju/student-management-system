package com.studentmanagement.app;

import com.studentmanagement.dao.StudentDAO;
import com.studentmanagement.model.Student;

public class Main {

    public static void main(String[] args) {

        // Create DAO
        StudentDAO dao = new StudentDAO();

        // Create Students
        Student student1 = new Student(1, "Rahul", 20, "AI&DS");
        Student student2 = new Student(2, "Priya", 21, "IT");

        // Add Students
        dao.addStudent(student1);
        dao.addStudent(student2);

        // Display All Students
        System.out.println("\n===== STUDENTS =====");

        for (Student student : dao.getAllStudents()) {
            System.out.println(student);
        }
    }
}