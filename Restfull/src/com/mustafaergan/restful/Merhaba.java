package com.mustafaergan.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/merhaba")
public class Merhaba {
	
	@GET
	@Path("/selamcak")
	public String selamCak() {
		return "Merhaba Dunya";
	}

}
