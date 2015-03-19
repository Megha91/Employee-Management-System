package com.flp.ems.domain;

public class Department implements Comparable<Department> {
	private int departmentId;
	private String name,description;
	
		
	public Department(int departmentId, String name, String description) {
		super();
		this.departmentId = departmentId;
		this.name = name;
		this.description = description;
	}
	
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
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


	@Override
	public int compareTo(Department o) {
		
		return (o.getDepartmentId()>this.getDepartmentId())?-1:(o.getDepartmentId()==this.getDepartmentId())?0:1;
	}
	
	
}
