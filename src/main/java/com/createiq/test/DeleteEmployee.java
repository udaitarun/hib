package com.createiq.test;

import com.createiq.dao.EmployeeDao;
import com.createiq.dao.EmployeeDaoImpl;
import com.createiqcrud.Employee;

public class DeleteEmployee {
	
	public static void main(String[] args) {
		
	
	
	EmployeeDao employeeDao = new EmployeeDaoImpl();
	employeeDao.delete(100);

	
	}	

}
