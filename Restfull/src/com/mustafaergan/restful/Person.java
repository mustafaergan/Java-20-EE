package com.mustafaergan.restful;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.google.gson.Gson;
import com.mustafaergan.entity.PersonEntity;

@Path("person")
public class Person {
	
	Gson gson = new Gson();
	
	
	@GET
	@Path("/{param1}")
	public String getPerson(@PathParam("param1")
	int id) {
		PersonEntity personEntity = Service.getService().personList.get(id);
		String veri = gson.toJson(personEntity);
		return veri;
	}
	
	@POST
	@Path("/addperson")
	public String addPerson(@FormParam("id") int id,
			@FormParam("name") String name){
		Service.getService().personList.add(new PersonEntity(id, name));
		return "basarili";
	}
	
	
	
	

}
