package com.example.ti360.college.controllers;

import com.example.ti360.college.dto.StudentDTO;
import com.example.ti360.college.models.Student;
import com.example.ti360.college.services.StudentService;
import com.example.ti360.college.services.StudentServiceFindAll;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Students")
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentServiceFindAll studentServiceFindAll;

    @ApiOperation(value = "Inserir Aluno")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @ApiOperation(value = "Retorna uma lista de alunos cadastrados")
    @GetMapping
    public List<StudentDTO> studentList() {
        return studentServiceFindAll.findAllStudents();
    }

    @ApiOperation(value = "Retorna a busca de um aluno pelo nome")
    @GetMapping("/{name}")
    public List<Student> findByName(@PathVariable String name) {
        return studentService.findByName(name);
    }

    @ApiOperation(value = "Altera os dados de um aluno informando o ID")
    @PutMapping("/{id}")
    public ResponseEntity<Student> replace(@PathVariable Long id, @RequestBody Student student) {
        return studentService.replace(id, student);
    }

    @ApiOperation(value = "Excluir um aluno informando o ID ")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);

    }
}
