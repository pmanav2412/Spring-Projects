package com.demo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "creditcard")
public class CreditCard {

	@Id
	@GeneratedValue
	private int id;

	private String nameOnCard;
	private String Company;
	private Integer cvv;
	private Integer cardNo;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="creditCard")
	private Account account;
	
	
	public CreditCard() {
		
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	public Integer getCardNo() {
		return cardNo;
	}

	public void setCardNo(Integer cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * @param id
	 * @param nameOnCard
	 * @param company
	 * @param cvv
	 * @param cardNo
	 */
	public CreditCard(String nameOnCard, String company, Integer cvv, Integer cardNo) {

		this.nameOnCard = nameOnCard;
		Company = company;
		this.cvv = cvv;
		this.cardNo = cardNo;
	}

}
