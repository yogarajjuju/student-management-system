package com.studentmanagement.dao;

import java.util.ArrayList;
import java.util.List;

import com.studentmanagement.model.Student;

public class StudentDAO {

    // Store students here
    private ArrayList<Student> students = new ArrayList<>();

    // Create
    public void addStudent(Student student) {
        students.add(student);
    }

    // Read
    public List<Student> getAllStudents() {
        return students;
    }

    // Update
    public boolean updateStudent(Student updatedStudent) {

        for (Student student : students) {

            if (student.getId() == updatedStudent.getId()) {

                student.setName(updatedStudent.getName());
                student.setAge(updatedStudent.getAge());
                student.setDepartment(updatedStudent.getDepartment());

                return true;
            }
        }

        return false;
    }
    public boolean deleteStudent(int id) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getId() == id) {

                students.remove(i);
                return true;
            }
        }

        return false;
    }
}