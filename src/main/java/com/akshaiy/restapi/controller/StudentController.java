package com.akshaiy.restapi.controller;

import com.akshaiy.restapi.model.Student;
import com.akshaiy.restapi.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{studentRollNum}")
    public Student getStudentDetails(@PathVariable("studentRollNum") String rno) {
        return studentService.getStudent(rno);
    }

    @GetMapping()
    public List<Student> getAllStudentDetails() {
        return studentService.getAllStudents();
    }


    @PostMapping
    public String createStudentDetails(@RequestBody Student student) {
        studentService.createStudent(student);
        return "Student details created";
    }

    @PutMapping
    public String updateStudentDetails(@RequestBody Student student) {
        studentService.updateStudent(student);
        return "Student details updated";
    }

    @DeleteMapping("{studentRollNum}")
    public String deleteStudentDetails(@PathVariable("studentRollNum") String rno) {
        studentService.deleteStudent(rno);
        return "Student details deleted";
    }
}
