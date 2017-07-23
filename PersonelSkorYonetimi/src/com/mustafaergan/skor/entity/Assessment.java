package com.mustafaergan.skor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Assessment {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	int id;
	
	@OneToOne
	Person person;
	
	String assessmentNote;
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setAssessmentNote(String assessmentNote) {
		this.assessmentNote = assessmentNote;
	}
	
	public String getAssessmentNote() {
		return assessmentNote;
	}
	

}
