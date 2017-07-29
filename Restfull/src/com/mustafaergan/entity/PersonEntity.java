package com.mustafaergan.entity;

public class PersonEntity {
	int id;
	String name;
	
	public PersonEntity(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}
