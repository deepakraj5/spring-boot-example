package com.deepak.springbootexample.repository;

import com.deepak.springbootexample.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
