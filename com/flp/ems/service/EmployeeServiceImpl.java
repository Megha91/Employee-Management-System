package com.flp.ems.service;

import java.util.Iterator;
import java.util.List;

import com.flp.ems.domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public int addEmployee(Employee emp,List<Employee> lst) {
//		for the first entry
		Iterator<Employee> it=lst.iterator();
		
		while(it.hasNext()){
			Employee e1=it.next();
			if(e1.getKinId().equals(emp.getKinId())||e1.getEmailId().equals(emp.getEmailId()))
			{	System.out.println("Duplication");	return 1;	}
			
		}
		
	return 0;

	}

	@Override
	public void ModifyEmployee() {
		

	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub

	}

	
}
