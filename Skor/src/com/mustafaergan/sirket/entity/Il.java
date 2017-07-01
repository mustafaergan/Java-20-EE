package com.mustafaergan.sirket.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Il {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int id;
	
	String name;
	
	@OneToMany
	@JoinTable(name="il_adres", joinColumns=
	@JoinColumn(name="il_id"),
	inverseJoinColumns = @JoinColumn(name="adres_id"))
	List<Adres> adresList = new ArrayList<>();
	
	public void setAdresList(List<Adres> adresList) {
		this.adresList = adresList;
	}
	
	public List<Adres> getAdresList() {
		return adresList;
	}
	
	
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
