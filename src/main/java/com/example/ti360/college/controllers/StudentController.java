package com.example.ti360.college.controllers;

import com.example.ti360.college.dto.StudentDTO;
import com.example.ti360.college.models.Student;
import com.example.ti360.college.services.StudentService;
import com.example.ti360.college.services.StudentServiceFindAll;
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

    @Autowired
    private StudentServiceFindAll studentServiceFindAll;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<StudentDTO> studentList() {
        return studentServiceFindAll.findAllStudents();
    }

    @GetMapping("/{name}")
    public List<Student> findByName(@PathVariable String name) {
        return studentService.findByName(name);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> replace(@PathVariable Long id, @RequestBody Student student) {
        return studentService.replace(id, student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);

    }
}
