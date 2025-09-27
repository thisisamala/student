package com.iplus.studentManagement.controller;
import org.springframework.stereotype.Controller;



import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.iplus.studentManagement.entity.Student;

import jakarta.validation.Valid;

@Controller
public class StudentController {


    @GetMapping("/students")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "students";
    }
    
    @PutMapping("/students/edit/")
    public String editStudent(Model model) {
        model.addAttribute("student", new Student());
        return "edit_student";
    }
    
    
    @DeleteMapping("/students/delete/")
    public String deleteStudent(Model model) {
        model.addAttribute("student", new Student());
        return "students";
    }
    
    @PutMapping("/students/new/")
    public String newStudent(Model model) {
        model.addAttribute("student", new Student());
        return "create_student";
    }


    @PostMapping("/student/save")
    public String saveStudent(@Valid @ModelAttribute("student") Student student,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "edit_student";
        }
        return "students";
    }
}


