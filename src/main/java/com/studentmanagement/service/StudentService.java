package com.studentmanagement.service;
import java.util.*;

import com.studentmanagement.dao.StudentDAO;
import com.studentmanagement.model.Student;

public class StudentService {

    private StudentDAO dao = new StudentDAO();

    public void addStudent(Student student) {
        dao.addStudent(student);

    }
    public List<Student> getAllStudents() {

        return dao.getAllStudents();

    }
}