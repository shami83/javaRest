package com.example.rest.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.rest.pojo.BasicEmployee;

public class BasicEmployeeDao {
	
	public List<BasicEmployee> getAllUsers()
	{
		BasicEmployee emp1=new BasicEmployee();
		emp1.setName("Shamik Mitra");
		emp1.setExperience(10);
		emp1.setRole("Team Lead");
		emp1.setCompanyName("IBM");
		
		BasicEmployee emp2=new BasicEmployee();
		emp2.setName("Swastika Mitra");
		emp1.setExperience(10);
		emp1.setRole("Team Lead");
		emp1.setCompanyName("CTS");
		
		List<BasicEmployee> list = new ArrayList<BasicEmployee>();
		list.add(emp1);
		list.add(emp2);
		
		return list;
		
	}

}
