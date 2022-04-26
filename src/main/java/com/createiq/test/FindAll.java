package com.createiq.test;

import java.util.List;

import com.createiq.dao.EmployeeDao;
import com.createiq.dao.EmployeeDaoImpl;
import com.createiqcrud.Employee;

public class FindAll {
	
	public static void main(String[] args) {
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		
		List<Employee> employees = employeeDao.findAll();
		employees.forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
