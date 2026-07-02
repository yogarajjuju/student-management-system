package com.studentmanagement.dao;

// imports
import java.util.ArrayList;
import java.util.List;

import com.studentmanagement.model.Student;

public class StudentDAO {

    // Store students here
    private ArrayList<Student> students =new ArrayList<>();


    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added successfully!");

    }
    public List<Student> getAllStudents() {

        // ???
        return students;

    }

}