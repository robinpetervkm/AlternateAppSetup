package com.norha;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/app")
public class App {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Name demo () {
		return new Name("Robin","Peter");
	}

}
