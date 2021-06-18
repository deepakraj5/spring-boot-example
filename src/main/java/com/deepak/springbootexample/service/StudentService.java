package com.deepak.springbootexample.service;

import com.deepak.springbootexample.models.Student;
import com.deepak.springbootexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void newStudent(Student student) {
        repository.save(student);
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }
}
