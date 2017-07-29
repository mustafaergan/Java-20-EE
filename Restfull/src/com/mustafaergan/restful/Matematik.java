package com.mustafaergan.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("mat")
public class Matematik {
	
	@GET
	@Path("/{param1}/{param2}")
	public String toplama(@PathParam("param1")
	int a, @PathParam("param2") int b) {
		return String.valueOf((a+b));
	}

	@GET
	@Path("/carpma/{param1}/{param2}")
	public String carpma(@PathParam("param1")
	String a, @PathParam("param2") String b) {
		return String.valueOf((a+"*"+b));
	}
}
