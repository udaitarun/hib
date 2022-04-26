package com.createiqcrud;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@ Table(name=("emp_tab"))

public class Employee {
	
	@Id
	
	
	@Column (name= "e_id")
	private int id;
	
	@Column (name="f_name")
	private String firstName;
	
	@Column (name= "s_name")
	private String lastName;
	
	
	public Employee() {
		super();
	}


	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
