package com.jspiders.springmvc1.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.jspiders.springmvc1.pojo.EmployeePOJO;

@Repository
public class EmployeeRespository {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static javax.persistence.Query query;
	private static String jpql;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("Employee");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}

	public EmployeePOJO addEmployee(String name, String email, long contact, String designation, double salary) {
		openConnection();
		transaction.begin();
		EmployeePOJO employee = new EmployeePOJO();
		employee.setName(name);
		employee.setEmail(email);
		employee.setContact(contact);
		employee.setDesignation(designation);
		employee.setSalary(salary);
		manager.persist(employee);
		transaction.commit();
		closeConnection();
		return employee;
	}

	public EmployeePOJO searchEmployee(int id) {
		openConnection();
		transaction.begin();
		EmployeePOJO employee = manager.find(EmployeePOJO.class, id);
		transaction.commit();
		closeConnection();
		return employee;
	}

	public List<EmployeePOJO> searchAllEmployees() {
		openConnection();
		transaction.begin();
		jpql = "from EmployeePOJO";
		query = manager.createQuery(jpql);
		List<EmployeePOJO> employees = query.getResultList();
		transaction.commit();
		closeConnection();
		return employees;
	}

	public void removeEmployee(int id) {
		openConnection();
		transaction.begin();
		EmployeePOJO employee = manager.find(EmployeePOJO.class, id);
		manager.remove(employee);
		transaction.commit();
		closeConnection();
	}

	public EmployeePOJO updateEmployee(int id, String name, String email, long contact, String designation,
			double salary) {
		openConnection();
		transaction.begin();
		EmployeePOJO employee = manager.find(EmployeePOJO.class, id);
		employee.setName(name);
		employee.setEmail(email);
		employee.setContact(contact);
		employee.setDesignation(designation);
		employee.setSalary(salary);
		manager.persist(employee);
		transaction.commit();
		closeConnection();
		return employee;
	}

	public void login(String username, String password) {
		
	}
}

	

