package com.mustafaergan.sirket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "Per")
public class Personel {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "idx",length =50)
	int personelId;
	
	@Column(nullable = true,length = 10)
	String name;
	
	@OneToOne
	Adres adres;
	
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
	
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	
	public Adres getAdres() {
		return adres;
	}
	
	
}
