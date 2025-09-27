package com.iplus.studentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import com.iplus.studentManagement.entity.UserEntity;

@Controller
public class UserEntityController {
	@PutMapping("/login")
    public String toLogin(Model model) {
        model.addAttribute("user", new UserEntity());
        return "login";
	} 
	
	@PutMapping("/signup")
    public String toSign(Model model) {
        model.addAttribute("user", new UserEntity());
        return "signup";
	} 

}
