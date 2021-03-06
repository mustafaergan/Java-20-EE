package com.mustafaergan.sirket.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Skor {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int id;
	
	String name;
	
	@Transient
	String veri;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

}
