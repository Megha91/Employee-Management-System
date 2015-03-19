package com.flp.ems.domain;

public class Project implements Comparable<Project> {
	private int projectId;
	private String name,description;
	private Department department;
	
	
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	public Project(int projectId, String name, String description,
			Department department) {
		super();
		this.projectId = projectId;
		this.name = name;
		this.description = description;
		this.department = department;
	}
	@Override
	public int compareTo(Project o) {
		
		return (o.getProjectId()>this.getProjectId())?-1:(o.getProjectId()==this.getProjectId())?0:1;
	}
	
	
	
	
}

