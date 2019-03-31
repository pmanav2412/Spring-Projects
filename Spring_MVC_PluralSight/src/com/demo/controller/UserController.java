package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@RequestMapping("/new")
    public String newUser() {
    	return "register";
    }
	
	
	@RequestMapping("/name")
    public String ReqParam(@RequestParam("username") String username, Model model) {
    	model.addAttribute("username", username);
		return "register";
    }
	
	
	@RequestMapping(value="/name/{username}")
    public String ReqPath(@PathVariable("username") String username, Model model) {
//    	model.addAttribute("username", username);
		return "register";
    }
	
	
	@RequestMapping(value="/*")
    public String Default() {
//    	model.addAttribute("username", username);
		return "Error";
    }
}
