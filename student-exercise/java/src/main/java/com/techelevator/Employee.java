package com.techelevator;

import java.util.List;
import java.text.NumberFormat;

public class Employee {
	private long employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary = 60000D;
	private List<Department> department;
	private String hireDate;
	private String fullName;
	
	public Employee(long employeeId, String firstName, String lastName, String email, double salary, List<Department> department, String hireDate) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
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
	
	public List<Department> getDepartment() {
		return this.department;
	}
	
	public String getHireDate() {
		return this.hireDate;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
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
		//NumberFormat fmt = NumberFormat.getCurrencyInstance();
	}
	
	public void setDepartment(List<Department> department) {
		this.department = department;
	}
	
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	public double raiseSalary(double percent) {
		return salary * percent;
	}
}

