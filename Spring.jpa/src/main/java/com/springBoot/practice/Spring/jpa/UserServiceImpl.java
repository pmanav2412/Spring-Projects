package com.springBoot.practice.Spring.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class UserServiceImpl {
  
	@Autowired
	UserRepo userrepo;
	
	
	@Transactional
	public boolean saveUser(User user) {
		
		userrepo.save(user);
		return true;
	}
	
	@Transactional
	public List<User> getAllUser() {
		List<User> users = userrepo.findAll();
		return users;
	}
	
	
}
