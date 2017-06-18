package com.mustafaergan.sirket.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personel {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int personelId;
	
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}
	
	public int getPersonelId() {
		return personelId;
	}
	
	public String getName() {
		return name;
	}
	
}
