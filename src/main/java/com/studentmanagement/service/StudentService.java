package com.studentmanagement.service;
import java.util.*;

import com.studentmanagement.dao.StudentDAO;
import com.studentmanagement.model.Student;

public class StudentService {

    private StudentDAO dao = new StudentDAO();

    public void addStudent(Student student) {

        if (student.getName().trim().isEmpty()) {
            System.out.println("Student name cannot be empty.");
            return;
        }

        if (student.getAge() < 18 || student.getAge() > 60) {
            System.out.println("Student age must be between 18 and 60.");
            return;
        }

        dao.addStudent(student);
    }
    public List<Student> getAllStudents() {

        return dao.getAllStudents();

    }
}