package com.jspiders.springcorexml.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcorexml.Detail.EmployeeDetails;

public class EmployeeConfig {
	
	@Bean("emp1")
	public EmployeeDetails getEmployee() {
		
		EmployeeDetails emp1 = new EmployeeDetails();
		emp1.setId(1);
		emp1.setName("Utkarsha");
		emp1.setEmail("utk@gmail.com");
		return emp1;
	}
	
	
	@Bean("emp")
	public EmployeeDetails getEmployee2() {
		EmployeeDetails emp = new EmployeeDetails(2, "Ajit", "Ajit@gmail.com");
		return emp;
	}
}
