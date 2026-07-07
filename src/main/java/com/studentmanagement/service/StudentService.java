package com.studentmanagement.service;
import java.util.*;

import com.studentmanagement.dao.StudentDAO;
import com.studentmanagement.model.Student;

public class StudentService {

    private final StudentDAO dao = new StudentDAO();


    public void addStudent(Student student){
        validateStudent(student);
        dao.addStudent(student);
    }

    private void validateStudent(Student student) {

        if (student.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty.");

        }

        if (student.getAge() < 18 || student.getAge() > 60) {
            throw new IllegalArgumentException("Student age must be between 18 and 60.");

        }


    }
    public List<Student> getAllStudents() {

        return dao.getAllStudents();

    }
    public boolean updateStudent(Student student) {
        validateStudent(student);
        return dao.updateStudent(student);
    }
    public boolean deleteStudent(int id) {
        return dao.deleteStudent(id);
    }
}