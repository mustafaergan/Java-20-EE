package com.mustafaergan.skor.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	String id;
	
	String name = "asd";
	
	String userName;
	
	String password;
	
	int role;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setRole(int role) {
		this.role = role;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getRole() {
		return role;
	}
	
	public String getUserName() {
		return userName;
	}

}
