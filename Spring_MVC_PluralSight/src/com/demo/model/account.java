package com.demo.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;



public class account {
	
	@NotNull(message="First name should not be null")
	@Size(max=10,min=2,message="Invalid Length")
	@Pattern(regexp="[A-Za-z(\\s)]")
	private String firstname;
	
	@NotNull(message="Last Name Should Not be Null")
	private String lastname;
	
	@NotNull(message="Enter The valid Date Formate")
	@DateTimeFormat(pattern="mm/dd/yyyy")
	private Date dob;
	
	@NotNull(message="Phone number must requred")
	private Long number;

	@NotNull(message="Provide your city name")
	private String city;
	
	@NotNull(message="Provide your country name")
	private String country;


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 
	 */
	public account() {
		firstname = "";
	}
	
	
	
}
