package com.createiq.test;

import com.createiq.dao.EmployeeDao;

import com.createiq.dao.EmployeeDaoImpl;
import com.createiqcrud.Employee;

public class AddEmployee {
	
	public static void main(String[] args) {
	
	EmployeeDao employeeDao=new EmployeeDaoImpl();
	Employee employee1 = new Employee(100, "Mutyala", "uday");
	Employee employee2 = new Employee(200, "rachakonda","sumanth");
	Employee employee3 = new Employee(300, "kancharla","praveen");
	Employee employee4 = new Employee(400, "bolloju","srikanth");
	
	employeeDao.save(employee1);
	employeeDao.save(employee2);
	employeeDao.save(employee3);
	employeeDao.save(employee4);
	

	}


}
