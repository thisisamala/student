package com.iplus.studentManagement.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.iplus.studentManagement.entity.Enrollment;


import jakarta.validation.Valid;



@Controller
public class EnrollmentController {



    @GetMapping("/enrollments")
    public String showEnrollments(Model model) {
        model.addAttribute("enrollment", new Enrollment());
        return "enrollments";
    }
    
    @PutMapping("/enrollments/edit")
    public String editEnrollments(Model model) {
        model.addAttribute("enrollment", new Enrollment());
        return "edit_enrollment";
    }
    
    @PutMapping("/enrollments/new")
    public String newEnrollments(Model model) {
        model.addAttribute("enrollment", new Enrollment());
        return "create_enrollments";
    }
    
	
    @DeleteMapping("/enrollments/delete/")
    public String deleteEnrollments(Model model) {
        model.addAttribute("enrollment", new Enrollment());
        return "enrollments";
    }
    
    @PostMapping("/enrollments/save")
    public String saveEnrollments(@Valid @ModelAttribute("enrollment") Enrollment enrollment,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "edit_enrollment";
        }
        return "enrollment";
    }

}
