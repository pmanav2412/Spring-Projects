package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
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
		model.addAttribute("account", new account());
		return "form";
		
	}
	
	@RequestMapping("/seedata")
	public String SeaHello( Model model, @RequestParam("firstname") String name, @RequestParam("lastname") String lname ) {
	
		account Account = new  account();
		Account.setFirstname(name);
		Account.setLastname(lname);
		model.addAttribute("acc", Account);
		
		
		return "Hello";
		
	}
	
}
