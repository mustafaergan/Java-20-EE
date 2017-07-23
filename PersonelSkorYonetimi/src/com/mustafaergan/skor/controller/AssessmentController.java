package com.mustafaergan.skor.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.mustafaergan.skor.dao.DAO;
import com.mustafaergan.skor.entity.Assessment;
import com.mustafaergan.skor.entity.Person;

@ManagedBean
@SessionScoped
public class AssessmentController {
	DAO dao;
	
	List<Person> personList;
	
	List<String> personName;
	
	List<Assessment> assessmentList;
	
	String secilenPersonelName;
	
	Assessment assAdd;
	
	@PostConstruct
	public void init() {
		assAdd = new Assessment();
		personName = new ArrayList<>();
		dao = new DAO();
		createPersonNameList();
		assessmentList = dao.getAssment();
	}
	
	private void createPersonNameList() {
		personList = dao.getPErsonList();
		for (int i = 0; i < personList.size(); i++) {
			personName.add(personList.get(i).getName());
		}
	}
	
	private Person findPersonNamePerson(String name) {
		personList = dao.getPErsonList();
		for (int i = 0; i < personList.size(); i++) {
			if(personList.get(i).getName().equals(name))
				return personList.get(i);
		}
		return null;
	}
	
	public String save() {
		assAdd.setPerson(findPersonNamePerson(secilenPersonelName));
		dao.save(assAdd);
		assessmentList = dao.getAssment();
		return "skorview.xhmtl?faces-redirect=true";
	}
	
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	
	public void setPersonName(List<String> personName) {
		this.personName = personName;
	}
	
	public List<Person> getPersonList() {
		return personList;
	}
	
	public List<String> getPersonName() {
		return personName;
	}
	
	public void setSecilenPersonelName(String secilenPersonelName) {
		this.secilenPersonelName = secilenPersonelName;
	}
	
	public String getSecilenPersonelName() {
		return secilenPersonelName;
	}
	
	public void setAssAdd(Assessment assAdd) {
		this.assAdd = assAdd;
	}
	
	public Assessment getAssAdd() {
		return assAdd;
	}
	
	public void setAssessmentList(List<Assessment> assessmentList) {
		this.assessmentList = assessmentList;
	}
	
	public List<Assessment> getAssessmentList() {
		return assessmentList;
	}
	
}
