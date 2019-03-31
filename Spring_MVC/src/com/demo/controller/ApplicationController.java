package com.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;




@Controller
public class ApplicationController {

	@InitBinder
	public void initbunder(WebDataBinder Binder) {
		Binder.setDisallowedFields(new String[] {"lastname"});
	}
	
	
	@RequestMapping("/form")
	protected ModelAndView hello() {
		ModelAndView model = new ModelAndView("form");
		return model;
		
	}
	
	@RequestMapping("/login")
	protected ModelAndView result(@ModelAttribute("student1")Student student1, BindingResult Result) {
		

		
		if(Result.hasErrors()) {
			ModelAndView model = new ModelAndView("form");
			return model;
		}
		ModelAndView model = new ModelAndView("index");
		return model;
		
	}

}
