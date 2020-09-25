package com.techelevator;

import java.util.List;

public class Project {
	private String name;
	private String description;
	private String startDate;
	private String dueDate;
	List<String>teamMembers;

	public Project(String name, String description, String startDate, String dueDate) {
	
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.dueDate = dueDate;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getStartDate() {
		return this.startDate;
	}
	
	public String dueDate() {
		return this.dueDate;
	}
	
	public List<String> getTeamMembers() {
		return this.teamMembers;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public void setDescription() {
		this.description = description;
	}
	
	public void setStartDate() {
		this.startDate = startDate;
	}
	
	public void setdueDate() {
		this.dueDate = dueDate;
	}
}
