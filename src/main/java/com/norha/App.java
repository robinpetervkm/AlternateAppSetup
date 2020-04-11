package com.norha;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("app/{w}")
@Singleton
public class App {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo (@QueryParam("x") String x, @PathParam("w") String demo) {
		return "X = "+x+" Demo = "+demo;
	}

}
