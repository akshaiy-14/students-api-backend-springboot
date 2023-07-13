package com.akshaiy.restapi.service.impl;

import com.akshaiy.restapi.model.Student;
import com.akshaiy.restapi.repository.StudentRepository;
import com.akshaiy.restapi.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepo;

    public StudentServiceImpl(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public String createStudent(Student student) {
        studentRepo.save(student);
        return "Created and saved";
    }

    @Override
    public String updateStudent(Student student) {
        studentRepo.save(student);
        return "Updated and saved";
    }

    @Override
    public String deleteStudent(String rno) {
        studentRepo.deleteById(rno);
        return "Delete operation performed";
    }

    @Override
    public Student getStudent(String rno) {
        return studentRepo.findById(rno).get();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}
