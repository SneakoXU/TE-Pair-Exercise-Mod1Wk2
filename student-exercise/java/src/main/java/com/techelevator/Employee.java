package com.techelevator;

import java.util.List;

public class Employee {
	private long employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary = 60000;
	private List<String> department;
	private String hireDate;
	private String fullName = lastName + "," + firstName;

	public Employee(long employeeId, String firstName, String lastName, String email, List<String> department, String hireDate) {
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
	public List<String> getDepartment() {
		return this.department;
	}
	public String getHireDate() {
		return this.hireDate;
	}
	public String getFullName() {
		return this.fullName;
	}
	public void setEmployeeId() {
		this.employeeId = employeeId;
	}
	public void setFirstName() {
		this.firstName = firstName;
	}
	public void setEmail() {
		this.email = email;
	}
	public void setSalary() {
		this.salary = salary;
	}
	public void setDepartment() {
		this.department = department;
	}
	public void setHireDate() {
		this.hireDate = hireDate;
	}
	public double raiseSalary(double percent) {
		return salary * percent;
	}
}

