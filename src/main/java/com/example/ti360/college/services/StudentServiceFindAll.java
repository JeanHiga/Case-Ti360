package com.example.ti360.college.services;

import com.example.ti360.college.dto.StudentDTO;
import com.example.ti360.college.models.Student;
import com.example.ti360.college.repositories.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceFindAll {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<StudentDTO> findAllStudents() {
        return studentRepository.findAll().stream()
                .map(this::toStudentDTO).collect(Collectors.toList());

    }

    private StudentDTO toStudentDTO(Student student) {
        return modelMapper.map(student, StudentDTO.class);


    }
}
