package com.flp.ems.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;

public class BootClass {
	
	List<Employee> lst=new ArrayList();
	
	public void menuSelection(){
		String choice;
		do{
		Scanner read=new Scanner(System.in);
		UserInteraction uI=new UserInteraction();
		EmployeeServiceImpl eSI=new EmployeeServiceImpl();
		EmployeeDaoImplForList eD=new EmployeeDaoImplForList();
		String option;
		System.out.println("\t\tMenu");
		System.out.println("1. Create");
		System.out.println("2. Modify");
		System.out.println("3. Remove");
		System.out.println("4. Search");
		System.out.println("5. View all");
		System.out.println("Enter your choice");
		try{
		option=read.next();
		switch(option){
		case "1":{
			Employee empl1=uI.addEmployee();
			if(empl1==null)break;
			int c=eSI.addEmployee(empl1,lst);
			if(c==1)break;
			lst=eD.addEmployee(empl1,lst);
			for(Employee e:lst){
				System.out.println(e.getKinId()+"--------->"+e.getName());
			}
			
			break;
		}
		case "2":{
			if(lst.isEmpty()){System.out.println("List Empty");break;}
			Employee empl1=uI.modifyEmployee(lst);
			if(empl1==null)break;
			lst=eD.modifyEmployee(empl1,lst);
			for(Employee e:lst){
				System.out.println(e.getKinId()+"--------->"+e.getName());
			}
			break;
		}
		case "3":{
			if(lst.isEmpty()){System.out.println("List Empty");break;}
			Employee empl1=uI.removeEmployee(lst);
			if(empl1==null)break;
			lst=eD.removeEmployee(empl1,lst);
			break;
		}
		case "4":{
			Employee empl1=uI.searchEmployee(lst);
			break;
		}
		case "5":{
			for(Employee e:lst){
				System.out.println(e);
			}
			break;
		}
		default:{
			System.out.println("provide a valid option");
			break;
		}
		}
		}catch(InputMismatchException e){System.out.println("please give a valid choice");}
		System.out.println("Wanna continue with menu again [y/n]");
		choice=read.next();
		}while(choice.toLowerCase().charAt(0)=='y');
	}
	public static void main(String[] args) {
		BootClass bootClass=new BootClass();
		bootClass.menuSelection();
	}

}
