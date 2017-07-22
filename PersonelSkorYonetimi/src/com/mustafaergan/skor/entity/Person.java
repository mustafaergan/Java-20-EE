package com.mustafaergan.skor.entity;

public class Person {
	
	int id;
	
	String name = "asd";
	
	String userName;
	
	String password;
	
	int role;
	
	
	public void setId(int id) {
		this.id = id;
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
	
	public int getId() {
		return id;
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
