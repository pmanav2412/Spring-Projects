package com.demo.entity;

import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JacksonAnnotationValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;



@Entity
@Table(name="Account_Details")
public class Account  {
	
	@Id
	@Column
	@NotNull(message="Account should not be null")
	private Integer accNo;
	
	@NotNull(message="First name should not be null")
	@Column
	private String accHoldername;
	@Column
	private Integer balance;
	@Column
	private String accountType;
	
	@NotNull(message="Enter The valid Date Formate")
	@Column
	private Date dateOfBirth;
	
	@Column
	private String PsCode;
	
	@JsonManagedReference
	@OneToMany(fetch = FetchType.EAGER,mappedBy="account", cascade=CascadeType.ALL)
	private Set<CreditCard> creditCard = new HashSet<CreditCard>();
	
	
	public Set<CreditCard> getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(Set<CreditCard> creditCard) {
		this.creditCard = creditCard;
	}

	/**
	 * @param accNo
	 * @param accHoldername
	 * @param balance
	 * @param accountType
	 * @param dateOfBirth
	 * @param psCode
	 */
	public Account(Integer accNo, String accHoldername, Integer balance, String accountType, Date dateOfBirth,
			String psCode) {
		this.accNo = accNo;
		this.accHoldername = accHoldername;
		this.balance = balance;
		this.accountType = accountType;
		this.dateOfBirth = dateOfBirth;
		PsCode = psCode;
	}

	/**
	 * 
	 */
	public Account() {
	}

	public Integer getAccNo() {
		return accNo;
	}

	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}

	public String getAccHoldername() {
		return accHoldername;
	}

	public void setAccHoldername(String accHoldername) {
		this.accHoldername = accHoldername;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

//	@JsonSerialize(using=DateSerializer.class)
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

	@Override
	public String toString() {
		return String.format(
				"Account [accNo=%s, accHoldername=%s, balance=%s, accountType=%s, dateOfBirth=%s, PsCode=%s]", accNo,
				accHoldername, balance, accountType, dateOfBirth, PsCode);
	}


	

	
	
	
	
	

	
	
}
