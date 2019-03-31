package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String SeaHello(HttpServletRequest req, Model model) {
		String name = req.getParameter("firstname");
		String lname = req.getParameter("lastname");
		
		account Account = new  account();
		Account.setFirstname(name);
		Account.setLastname(lname);
		model.addAttribute("acc", Account);
		
		
		return "Hello";
		
	}
	
}
