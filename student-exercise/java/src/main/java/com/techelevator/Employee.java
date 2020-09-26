package com.techelevator;

import java.util.List;

public class Employee {
	private long employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	private Department department;
	private String hireDate;
	private String fullName;
	
	public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = 60000;
		this.department = department;
		this.hireDate = hireDate;
		
	}
	
	public Employee() {
	}
	
	public long getEmployeeId() {
		return this.employeeId;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public Department getDepartment() {
		return this.department;
	}
	
	public String getHireDate() {
		return this.hireDate;
	}
	
	public String getFullName() {
		return lastName + ", " + firstName;
	}
	
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName; 
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
		//salary = 60000;
		//NumberFormat fmt = NumberFormat.getCurrencyInstance();
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	public double raiseSalary(double percent) {
		return salary = salary * (1 + percent/100);
	}
}

