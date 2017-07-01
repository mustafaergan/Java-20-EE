package com.mustafaergan.sirket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Adres {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;

	@Column(name = "adres_verisi")
	String adresVerisi;
	
	
	@ManyToOne
	Il il;
	
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	int veri;
	
	
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
	
	public void setIl(Il il) {
		this.il = il;
	}
	
	public Il getIl() {
		return il;
	}
	
}
