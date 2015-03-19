package com.flp.ems.domain;

public class Role implements Comparable<Role>{
	
	private int roleId;
	private String name,description;
	
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
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
	
	
	
	public Role(int roleId, String name, String description) {
		super();
		this.roleId = roleId;
		this.name = name;
		this.description = description;
	}
	@Override
	public int compareTo(Role o) {
		// TODO Auto-generated method stub
		return (o.getRoleId()>this.getRoleId())?-1:(o.getRoleId()==this.getRoleId())?0:1;
	}
	
}
