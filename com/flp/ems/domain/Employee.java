package com.flp.ems.domain;
import java.util.*;
public class Employee {
	private int employeeId;
	private String kinId,name,emailId,address;
	private Calendar dateOfBirth,dateOfJoining;
	private String phoneNumber;
	private Department department;
	private Role role;
	private Project project;
	
	
	
	@Override
	public String toString() {
		return "\n EmployeeId=" + employeeId + "\n kinId=" + kinId
				+ "\n name=" + name + "\n emailId=" + emailId + "\n address="
				+ address + "\n dateOfBirth=" + dateOfBirth + "\n dateOfJoining="
				+ dateOfJoining + "\n phoneNumber=" + phoneNumber
				+ "\n department=" + department + ", role=" + role
				+ "\n project=" + project + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Employee(int employeeId, String kinId, String name, String emailId,
			String address, Calendar dateOfBirth, Calendar dateOfJoining,
			String phoneNumber, Department department, Role role, Project project) {
		super();
		this.employeeId = employeeId;
		this.kinId = kinId;
		this.name = name;
		this.emailId = emailId;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.phoneNumber = phoneNumber;
		this.department = department;
		this.role = role;
		this.project = project;
	}



	public String getKinId() {
		return kinId;
	}



	public void setKinId(String kinId) {
		this.kinId = kinId;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	
	
	
}
