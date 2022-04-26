package com.createiq.test;

import com.createiq.dao.EmployeeDao;
import com.createiq.dao.EmployeeDaoImpl;
import com.createiqcrud.Employee;

public class UpdateEmployee {
	
	public static void main(String[] args) {
	
	EmployeeDao employeeDao = new EmployeeDaoImpl();
	 
	Employee employee1 = new Employee(100, "Mutyala", "uday kumar");
	Employee employee2 = new Employee(200, "rachakonda","sumanth teja");
	Employee employee3 = new Employee(300, "kancharla","praveen kumar");
	Employee employee4 = new Employee(400, "bolloju","srikanth shetty");
	
	employeeDao.update(employee1);
	employeeDao.update(employee2);
	employeeDao.update(employee3);
	employeeDao.update(employee4);

}
}