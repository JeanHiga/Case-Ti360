package com.example.ti360.college.services;

import com.example.ti360.college.models.Student;
import com.example.ti360.college.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public Student addStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> findByName(String name) {
        return studentRepository.findByName(name);
    }

    public ResponseEntity<Student> replace(Student student) {
        studentRepository.save(student);

        return ResponseEntity.ok(student);
    }
}
