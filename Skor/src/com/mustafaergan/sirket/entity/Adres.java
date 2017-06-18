package com.mustafaergan.sirket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adres {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;

	@Column(name = "adres_verisi")
	String adresVerisi;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setAdresVerisi(String adresVerisi) {
		this.adresVerisi = adresVerisi;
	}
	
	public String getAdresVerisi() {
		return adresVerisi;
	}
	
}
