package com.norha;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/app")
@Singleton
public class App {
	
	private int x = 0;
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo (@QueryParam("x") String x) {
		return "Value of X is "+ x;
	}

}
