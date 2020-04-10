package com.norha;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/app")
public class App {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo () {
		System.out.println("Name :: "+ new Name("Robin","Peter"));
		return "I-love-rest";
	}

}
