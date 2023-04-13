package com.jspiders.springmvc1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.jspiders.springmvc1.pojo.EmployeePOJO;
import com.jspiders.springmvc1.repository.EmployeeRespository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRespository repository;

	public EmployeePOJO addEmployee(String name, String email, long contact, String designation, double salary) {
		EmployeePOJO employee = repository.addEmployee(name, email, contact, designation, salary);
		return employee;
	}

	public EmployeePOJO search(int id) {
		EmployeePOJO employee = repository.searchEmployee(id);
		return employee;
	}

	public List<EmployeePOJO> searchAllEmployees() {
		List<EmployeePOJO> employees = repository.searchAllEmployees();
		return employees;
	}

	public void removeEmployee(int id) {
		repository.removeEmployee(id);
	}

	public EmployeePOJO updateEmployee(int id, String name, String email, long contact, String designation,
			double salary) {
		EmployeePOJO employee = repository.updateEmployee(id, name, email, contact, designation, salary);
		return employee;
	}
	
}
