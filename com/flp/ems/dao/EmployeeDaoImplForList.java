package com.flp.ems.dao;

import java.util.Iterator;
import java.util.List;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao {

	@Override
	public List<Employee> addEmployee(Employee emp, List<Employee> lst) {
		lst.add(emp);
		return lst;
	}

	@Override
	public List<Employee> modifyEmployee(Employee emp,List<Employee> lst) {
		Iterator<Employee> it=lst.iterator();
		while(it.hasNext()){
			if(it.next().getKinId().equals(emp.getKinId()))it.remove();
		}
		lst.add(emp);
		return lst;

	}

	@Override
	public List<Employee> removeEmployee(Employee emp,List<Employee> lst) {
		Iterator<Employee> it=lst.iterator();
		while(it.hasNext()){
			if(it.next().getKinId().equals(emp.getKinId()))it.remove();
		}
		return lst;
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
