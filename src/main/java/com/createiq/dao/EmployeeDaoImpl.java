package com.createiq.dao;

import java.util.List;


import org.hibernate.Session;

import com.createiq.util.SessionUtil;
import com.createiqcrud.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	public void save(Employee employee) {
		
		Session session  = SessionUtil.getSession();
		session.save(employee);
		session.beginTransaction().commit();
	//	session.close();
		
		
	}

	public void update(Employee employee) {
		
		Session session  = SessionUtil.getSession();
		session.update(employee);
		session.beginTransaction().commit();
//		session.close();
		

	}

	public void delete(Integer eid) {
		
		Session session  = SessionUtil.getSession();
		Employee employee = new Employee();
		employee.setId(eid);
		session.delete(employee);
		
		session.beginTransaction().commit();
	//	session.close();
	
	}

	public Employee findByID(Integer eid) {
		
		Session session = SessionUtil.getSession();
		Employee employee = (Employee)session.get(Employee.class,eid);
		return employee;
		
		
		
		//SessionUtil.close(session);
	}

	public List<Employee> findAll() {
		
		Session session = SessionUtil.getSession();
		List<Employee> employees = session.createQuery("from Employee ").list();
		//List<Employee> employees = session.createQuery("from Employee where eid=? ").list();
		
		
		
		//SessionUtil.close(session);
		
		return employees;
		
	}

	@Override
	public Employee findByName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	

}
