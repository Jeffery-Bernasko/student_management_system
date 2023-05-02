package com.example.student_management_system.service.impl;

import com.example.student_management_system.entity.Student;
import com.example.student_management_system.repository.StudentRepository;
import com.example.student_management_system.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    // Return a list of all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
