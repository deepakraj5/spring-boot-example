package com.deepak.springbootexample.controller;

import com.deepak.springbootexample.models.Student;
import com.deepak.springbootexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/sample")
    public String test() {
        return "app running";
    }

    @PostMapping("/newstudent")
    public String newStudent(@RequestBody Student student) {
        studentService.newStudent(student);
        return "new student created";
    }

    @GetMapping("/getstudents")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
