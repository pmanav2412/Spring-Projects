package com.demo.controller;

import java.util.List;

import javax.validation.Valid;
import org.apache.tomcat.util.http.parser.MediaType;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.Services.AccountService;
import com.demo.entity.Account;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Controller
public class UserController {
	
	
	@Autowired
	AccountService accountService;
	
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
	
	

	@PostMapping(value="/saveData")
	public String SeaHello( @Valid @ModelAttribute("Account") Account account, BindingResult result) {
	
		accountService.saveAccount(account);
		
		if(result.hasErrors())
		return "AccountDetail-Form";
	else
		return "Hello";
		
	}
	
	@GetMapping(value="/allData")
	public String getAll(Model model){
		
		List<Account> allData =accountService.getAllUser();
		for(Account a:allData){
			System.out.println(a.getAccHoldername() + "  " + a.getBalance() );
		}
	model.addAttribute("accounts", allData);
		return "allUsers";
	}
	
	
	@GetMapping(value="/edit")
	public String updateAccount(@RequestParam("accountNo") int accountNo,Model model ) {
		
		
		Account account = accountService.getAccount(accountNo);
		
		model.addAttribute("Account", account);
		
		return "AccountDetail-Form";
	}
	
	
	@GetMapping(value="/delete")
	public String deleteAccount(@RequestParam("accountNo") int accountNo,Model model ) {
		
		
		 accountService.deleteAccount(accountNo);
	
		return "redirect:/allData";
	}
	

	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public @ResponseBody Account jsonData(@PathVariable("id")Integer accNo) {
		System.out.println(accNo+ " Here It is!");
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		
		Account account = accountService.getAccount(accNo);
		System.out.println(account.getAccHoldername()+ " name is");
		return account;
	}
}
