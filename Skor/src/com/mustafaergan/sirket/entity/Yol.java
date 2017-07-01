package com.mustafaergan.sirket.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Yol {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int benimKimlikBilgim;
	
	String isim;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "yol_adres",
	 joinColumns = @JoinColumn(name="yol_id"),
	 inverseJoinColumns = @JoinColumn(name="adres_id"))
	List<Adres> adresList = new ArrayList<>();
	
	
	public void setAdresList(List<Adres> adresList) {
		this.adresList = adresList;
	}
	
	public void setBenimKimlikBilgim(int benimKimlikBilgim) {
		this.benimKimlikBilgim = benimKimlikBilgim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public int getBenimKimlikBilgim() {
		return benimKimlikBilgim;
	}
	public List<Adres> getAdresList() {
		return adresList;
	}
	
	public String getIsim() {
		return isim;
	}
}
