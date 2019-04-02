package com.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Account;


@Service
public interface AccountService {

	public boolean saveAccount(Account account);
	
	public List<Account> getAllUser();

	public Account getAccount(int accountNo);

	public Account deleteAccount(int accountNo);
}
