package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("ctofservice")
public class CtoFService {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
		double fahrenheit;
		double celsius = 36.8;
		
		fahrenheit = ((celsius * 9)/5) + 32;
		
		String result = "@Produces(\"application/xml\") Output: \n\n C to F converter output: \n\n" + fahrenheit;
		return "<ctofservice>"
				+ "<celsius>"+ celsius +"</celsius>"
				+ "<ctofoutput>"+ result +"</ctofoutput>"
				+ "</ctofservice>";
	}
	
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") double c) {
		double fahrenheit;
		double celsius = c;
		
		fahrenheit = ((celsius * 9)/5) + 32;
		
		String result = "@Produces(\"application/xml\") Output: \n\n C to F converter output: \n\n" + fahrenheit;
		return "<ctofservice>"
				+ "<celsius>"+ celsius +"</celsius>"
				+ "<ctofoutput>"+ result +"</ctofoutput>"
				+ "</ctofservice>";
	}
}
