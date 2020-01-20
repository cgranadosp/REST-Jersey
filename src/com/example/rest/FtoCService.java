package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("ftocservice")
public class FtoCService {
	
	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException {
		
		JSONObject jsonObject = new JSONObject();
		double fahrenheit = 98.24;
		double celsius;
		
		celsius = (fahrenheit - 32) * 5 / 9;
		jsonObject.put("F value", fahrenheit);
		jsonObject.put("C value", celsius);
		
		String result = "@Produces(\"application/json\") Output: \n\n F to C converter output: \n\n" + jsonObject;
		
		return Response.status(200).entity(result).build();
	}
	
	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput(@PathParam("f") double f) throws JSONException {
		
		JSONObject jsonObject = new JSONObject();
		double celsius;
		
		celsius = (f - 32) * 5 / 9;
		jsonObject.put("F value", f);
		jsonObject.put("C value", celsius);
		
		String result = "@Produces(\"application/json\") Output: \n\n F to C converter output: \n\n" + jsonObject;
		
		return Response.status(200).entity(result).build();
	}
	
}
