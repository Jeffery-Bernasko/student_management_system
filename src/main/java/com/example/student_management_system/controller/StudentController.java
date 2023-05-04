package com.example.student_management_system.controller;

import com.example.student_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(path = "api/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // handler method to handle list students and return model and view
    @GetMapping()
    public String listStudents(Model model){
     model.addAttribute("students", studentService.getAllStudents());

     return "students";
    }
}
