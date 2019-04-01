package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.xml.ws.BindingType;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpRequestHandler;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.account;

@Controller
public class ApplicationController {

	
	@RequestMapping("/")
	public String SayHello() {
		return "Hello";
		
	}
	
	
	@RequestMapping("/data")
	public String SeeHello(Model model) {
		model.addAttribute("Account", new account());
		return "form";
		
	}
	
	@PostMapping(value="/seedata")
	public String SeaHello( @Valid @ModelAttribute("Account") account Account, BindingResult result) {
	if(result.hasErrors())
		return "form";
	else
		return "Hello";
		
	}
	
}
