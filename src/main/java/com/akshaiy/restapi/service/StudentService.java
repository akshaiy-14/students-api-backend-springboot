package com.akshaiy.restapi.service;

import com.akshaiy.restapi.model.Student;

import java.util.List;

public interface StudentService {
    public String createStudent(Student student);
    public String updateStudent(Student student);
    public String deleteStudent(String rno);
    public Student getStudent(String rno);
    public List<Student> getAllStudents();
}
