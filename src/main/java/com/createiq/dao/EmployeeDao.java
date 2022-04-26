package com.createiq.dao;

import java.util.List;


import com.createiqcrud.Employee;

public interface EmployeeDao {
	
	public void save (Employee employee);
	public void update (Employee employee);
	public void delete (Integer eid);
	
	public Employee findByID (Integer eid);
	
	public List<Employee> findAll();
	
	

}
