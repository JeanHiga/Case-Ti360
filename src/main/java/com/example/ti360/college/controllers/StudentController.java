package com.example.ti360.college.controllers;

import com.example.ti360.college.models.Student;
import com.example.ti360.college.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> studentList(){
        return studentService.findAllStudents();
    }

    @GetMapping("/{name}")
    public List<Student> findByName(@PathVariable String name){
        return studentService.findByName(name);
    }

    @PutMapping
    public ResponseEntity<Student> replace(@RequestBody Student student){
        return studentService.replace(student);
    }
}
