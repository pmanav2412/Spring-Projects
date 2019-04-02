package com.demo.Services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.DAO.AccountDAO;
import com.demo.entity.Account;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDAO accountDAO;
	
	
	@Override
	@Transactional
	public boolean saveAccount(Account account) {
		accountDAO.saveAccount(account);
		return true;
	}


	@Override
	@Transactional
	public List<Account> getAllUser() {
	       List<Account> allUser=   accountDAO.getAllUser();
		return allUser;
	}


	@Override
	@Transactional
	public Account getAccount(int accountNo) {
		Account account = (Account)accountDAO.getAccount(accountNo);
		return account;
	}


	@Override
	@Transactional
	public Account deleteAccount(int accountNo) {
		boolean deleted = accountDAO.deleteAccount(accountNo);
		return null;
	}

	
	
}
