package com.mustafaergan.restful;

import java.util.ArrayList;
import java.util.List;

import com.mustafaergan.entity.PersonEntity;

public class Service {
	
	private static Service service;
	
	public static Service getService(){
		if(service == null)
			service = new Service();
		return service;
	}
	
	List<PersonEntity> personList 
	= new ArrayList<>();
	
	public Service() {
		PersonEntity personEntity = new PersonEntity(0, "mustafa");
		personList.add(personEntity);
		personList.add(new PersonEntity(1, "hikmet"));
	}
	

}
