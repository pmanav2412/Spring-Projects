package com.springBoot.practice.Spring.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="User")
public class User {

	
	@Id
	@GeneratedValue()
	private Integer Id;
	
	@Column(name="User_Name")
	private String Name;
	
	
	@Column(name="Last_name")
	private String lname;

	
	public User() {
		
	}

	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @param id
	 * @param name
	 * @param lname
	 */
	public User(String name, String lname) {
	
		Name = name;
		this.lname = lname;
	}
	
	
	
}
