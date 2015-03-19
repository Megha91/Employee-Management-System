package com.flp.ems.dao;

import java.util.List;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {
	public List<Employee> addEmployee(Employee emp,List<Employee> lst); 
	public List<Employee> modifyEmployee(Employee emp,List<Employee> lst);
	public List<Employee> removeEmployee(Employee emp,List<Employee> lst);
	public void SearchEmployee();
	public void getAllEmployee();
}
