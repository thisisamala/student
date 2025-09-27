package com.iplus.studentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.iplus.studentManagement.entity.Course;


import jakarta.validation.Valid;





@Controller
public class CourseController {
	
	
	@GetMapping("/courses")
    public String showCourses(Model model) {
        model.addAttribute("course", new Course());
        return "courses";
	} 
	
	@PutMapping("/courses/edit")
    public String editCourses(Model model) {
        model.addAttribute("course", new Course());
        return "edit_courses";
    }
	
	@DeleteMapping("/courses/delete")
    public String deleteCourses(Model model) {
        model.addAttribute("course", new Course());
        return "courses";
    }
	
	@PutMapping("/courses/new")
    public String newCourses(Model model) {
        model.addAttribute("course", new Course());
        return "create_course";
    }
	
	@PostMapping("/courses/save")
    public String saveCourses(@Valid @ModelAttribute("course") Course course,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "edit_course";
        }
        return "courses";
    }

}
