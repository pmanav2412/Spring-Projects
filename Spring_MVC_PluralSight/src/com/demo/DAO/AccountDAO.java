package com.demo.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.entity.Account;

@Repository
public interface AccountDAO {

	public boolean saveAccount(Account account);
	
	public List<Account> getAllUser();

	public Account getAccount(int accountNo);

	public boolean deleteAccount(int accountNo);
}
