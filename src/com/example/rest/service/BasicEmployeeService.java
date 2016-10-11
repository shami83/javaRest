package com.example.rest.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.example.rest.dao.BasicEmployeeDao;
import com.example.rest.pojo.BasicEmployee;

@Path("/basicemployees")
public class BasicEmployeeService {
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<BasicEmployee> getBasicEmployees()	
	{
		BasicEmployeeDao dao= new BasicEmployeeDao();
		return dao.getAllUsers();
	}
	
	@Path("/say")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getInfo()	
	{
		//BasicEmployeeDao dao= new BasicEmployeeDao();
		return "hello Java";
	}


}
