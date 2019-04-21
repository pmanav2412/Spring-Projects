package com.demo.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Account;


@Repository
public class AccountDAOImpl implements AccountDAO{

	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean saveAccount(Account account) {
		boolean saveFlag = true;
//		Account ac = new Account();
//		ac.setAccNo(account.getAccNo());
//		ac.setAccHoldername(account.getAccHoldername());
//		ac.setBalance(account.getBalance());
//		ac.setAccountType(account.getAccountType());
//		ac.setDateOfBirth(account.getDateOfBirth());
//		ac.setPsCode(account.getPsCode());
		try {
			Session session = sessionFactory.getCurrentSession();
//			session.saveOrUpdate(ac);
			session.save(account);
		} catch (Exception e) {
			e.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Account> getAllUser() {
		
		List<Account> allData = new ArrayList<Account>();
		Session session = sessionFactory.getCurrentSession();
		try {
			@SuppressWarnings("rawtypes")
			Query query = session.createQuery("from Account");
			allData = query.getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return allData;
	}

	@Override
	public Account getAccount(Integer accountNo) {
		Account account = new Account();
		try {
			Session session= sessionFactory.openSession();
			account= session.load(Account.class, accountNo);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return account;
	}

	@Override
	public boolean deleteAccount(int accountNo) {
		boolean flagDelete = true;
	Session session = sessionFactory.getCurrentSession();
	try {
		Account ac = session.load(Account.class, accountNo);
		session.delete(ac);
	}catch(Exception e) {
		e.printStackTrace();
		flagDelete = false;
	}
		return flagDelete;
	}
	
	
	

}
