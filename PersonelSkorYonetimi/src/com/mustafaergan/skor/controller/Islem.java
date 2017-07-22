package com.mustafaergan.skor.controller;

import com.mustafaergan.skor.entity.Person;

public class Islem {
	
	public static void main(String[] args) {
		//jsf scope yapiyor
		PersonController personController = new PersonController();
		
		//jsf sayesinde
		personController.init();
		
		Person person = personController.getPersonAdd();
		
		person.getName();
		person.setName("mustafa");
	}

}
