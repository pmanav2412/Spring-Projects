package com.demo.controller;


import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.entity.Account;
import com.demo.model.account;

@Controller
public class ApplicationController {

	
	@RequestMapping("/")
	public String SayHello() {
		return "Hello";
		
	}
	
	
	@RequestMapping("/data")
	public String SeeHello(Model model) {
		model.addAttribute("Account", new Account());
		return "AccountDetail-Form";
		
	}
	
	@PostMapping(value="/seedata")
	public String SeaHello( @Valid @ModelAttribute("Account") account Account, BindingResult result) {
	if(result.hasErrors())
		return "form";
	else
		return "Hello";
		
	}
	
	
	
}
