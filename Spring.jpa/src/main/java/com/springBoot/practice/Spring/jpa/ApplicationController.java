package com.springBoot.practice.Spring.jpa;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	
	@Autowired
	private UserServiceImpl userserviceimpl;

	@RequestMapping("/Hello")
	public String Hello() {
		User user= new User("manav", "patel");
		userserviceimpl.saveUser(user);
		return "user saved";
	}
	
	@RequestMapping("/Users")
	public List<User> allUsers() {
		
		List<User> users =userserviceimpl.getAllUser();
		return users;
	}
	
	
}
