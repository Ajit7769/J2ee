package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcorexml.Detail.EmployeeDetails;
import com.jspiders.springcorexml.config.EmployeeConfig;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		EmployeeDetails emp1 = (EmployeeDetails) context.getBean("emp1");
		System.out.println(emp1);
		
		EmployeeDetails emp = (EmployeeDetails) context.getBean("emp");
		System.out.println(emp);
		
		
		((AnnotationConfigApplicationContext)context).close();
	}
}