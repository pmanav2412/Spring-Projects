package com.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account_Details")
public class Account {
	
	@Id
	@Column
	private int accNo;
	@Column
	private String accHoldername;
	@Column
	private int balance;
	@Column
	private String accountType;
	@Column
	private Date dateOfBirth;
	@Column
	private String PsCode;
	
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccHoldername() {
		return accHoldername;
	}
	public void setAccHoldername(String accHoldername) {
		this.accHoldername = accHoldername;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPsCode() {
		return PsCode;
	}
	public void setPsCode(String psCode) {
		PsCode = psCode;
	}
	
	

	
	
}
