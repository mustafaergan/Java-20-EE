package com.mustafaergan.skor.controller;

import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.mustafaergan.skor.dao.DAO;
import com.mustafaergan.skor.entity.Person;
import com.mustafaergan.skor.jdbc.MyDatabase;

@ManagedBean
@SessionScoped
public class PersonController {

	Person personAdd;
	
	List<Person> personList;
	
	@PostConstruct
	public void init(){
		personAdd = new Person();
		DAO dao = new DAO();
		personList = dao.getPErsonList();
	}
	
	
	public String save(){
		System.out.println(personAdd.getName());
		MyDatabase database = new MyDatabase();
		personAdd.setId(UUID.randomUUID().toString());
		database.addPerson(personAdd);
		DAO dao = new DAO();
		personList = dao.getPErsonList();
		return "userview.xhtml?faces-redirect=true";
	}
	
	
	public void setPersonAdd(Person personAdd) {
		this.personAdd = personAdd;
	}
	public Person getPersonAdd() {
		return personAdd;
	}
	
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	
	public List<Person> getPersonList() {
		return personList;
	}
	
}
