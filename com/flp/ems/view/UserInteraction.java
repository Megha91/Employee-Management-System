package com.flp.ems.view;

import java.util.*;

import com.flp.ems.domain.*;
import com.flp.ems.util.*;

public class UserInteraction {
		
		public Set<Department> getDepartment(){
			Set<Department> departments=new TreeSet();
			Department sales=new Department(1,"Sales","To sell product");
			Department finance=new Department(2,"finance","To sell product");
			Department purchase=new Department(3,"purchase","To sell product");
			Department hr=new Department(4,"HR","To sell product");
			Department marketting=new Department(5,"Marketting","To sell product");
			
			departments.add(sales);
			departments.add(finance);
			departments.add(purchase);
			departments.add(hr);
			departments.add(marketting);
			
			
			return departments;
		}
		
		
		public Set<Role> getRole(){
			Set<Role> role=new TreeSet();
			Role manager=new Role(1, "Manager","manages team");
			Role teamLeader=new Role(2, "Team Leader","Leads team");
			Role assosiate=new Role(3, "Assosiate","Does work");
			
			role.add(manager);
			role.add(teamLeader);
			role.add(assosiate);
			
			return role;
		}
		
		public Set<Project> getProject(){
		
				Set<Project> project=new TreeSet();
				Project morgen=new Project(1, "Morgen", "description1", new Department(1,"Sales","To sell product"));
				Project hsbc=new Project(2, "HSBC","Description 2" , new Department(1,"Sales","To sell product"));
				Project bnpp=new Project(3, "BNPP","Description 3" ,new Department(2,"finance","To sell product"));
				Project scope=new Project(4, "Scope","Description 1" , new Department(2,"finance","To sell product"));
				Project citiBank=new Project(5, "Citi bank","Description 2" ,new Department(3,"purchase","To sell product"));
				Project insurance=new Project(6, "Insurance","Description 3" ,new Department(3,"purchase","To sell product"));
				Project rbs=new Project(7, "Royal bank of scotland","Description 1" , new Department(5,"Marketting","To sell product"));
				Project hdfcBank=new Project(8, "HDFC Bank","Description 2" ,  new Department(4,"HR","To sell product"));
				Project pepsi=new Project(9, "Pepsi","Description 3" ,  new Department(4,"HR","To sell product"));
				Project coke=new Project(10, "Coke","Description 1" , new Department(5,"Marketting","To sell product"));
				
				project.add(coke);
				project.add(pepsi);
				project.add(hdfcBank);
				project.add(rbs);
				project.add(insurance);
				project.add(citiBank);
				project.add(scope);
				project.add(bnpp);
				project.add(hsbc);
				project.add(morgen);
				return project;
		}
		
	
		public Employee addEmployee(){
			Scanner read=new Scanner(System.in);
			String choice;
			Employee emp=null;
			
			
//			do{
						
			String name;
			do{
			System.out.println("Enter the employee name :");
			name=read.next();
			}while(!Validate.checkName(name));
			
			String kinId;
			do{
			System.out.println("Enter the KinID:");
			kinId=read.next();
			}while(!Validate.checkKinId(kinId));
			
			String email;
			do{
			System.out.println("Enter email id:");
			email=read.next();
			}while(!Validate.checkEmail(email));
	
			String phone;
			do{
			System.out.println("Enter your phone number:");
			phone=read.next();
			}while(!Validate.checkPhone(phone));
			
			System.out.println("Enter yor Address");
			String address=read.next();
			
			//date of joining and date of birth
			String date;
			do{
			
			System.out.println("Date of birth in DD-MMM-YYYY ");
			date=read.next();
			}while(!Validate.checkDate(date));
			String[] str=date.split("-");
			int dat=Integer.parseInt(str[0]);
			int mon;
			if(str[1].equalsIgnoreCase("jan"))mon=0;
			else if(str[1].equalsIgnoreCase("feb"))mon=1;
			else if(str[1].equalsIgnoreCase("mar"))mon=2;
			else if(str[1].equalsIgnoreCase("apr"))mon=3;
			else if(str[1].equalsIgnoreCase("may"))mon=4;
			else if(str[1].equalsIgnoreCase("jun"))mon=5;
			else if(str[1].equalsIgnoreCase("jul"))mon=6;
			else if(str[1].equalsIgnoreCase("aug"))mon=7;
			else if(str[1].equalsIgnoreCase("sep"))mon=8;
			else if(str[1].equalsIgnoreCase("oct"))mon=9;
			else if(str[1].equalsIgnoreCase("nov"))mon=10;
			else mon=11;
			int yr=Integer.parseInt(str[2]);		
			Calendar dob=new GregorianCalendar(yr, mon, dat);
//			System.out.println("Date :");
//			int dat=read.nextInt();
//			System.out.println("Month:");
//			int mon=read.nextInt();
//			System.out.println("Year :");
//			int year=read.nextInt();
//			Calendar test=new GregorianCalendar(year, month, dayOfMonth)
			
			String date1;
			do{			
			System.out.println("Date of Joining in DD-MM-YYYY");
			date1=read.next();
			}while(!Validate.checkDate(date));
			String[] str1=date1.split("-");
			int dat1=Integer.parseInt(str[0]);
			int mon1;
			if(str1[1].equalsIgnoreCase("JAN"))mon1=0;
			else if(str1[1].equalsIgnoreCase("FEB"))mon1=1;
			else if(str1[1].equalsIgnoreCase("MAR"))mon1=2;
			else if(str1[1].equalsIgnoreCase("APR"))mon1=3;
			else if(str1[1].equalsIgnoreCase("MAy"))mon1=4;
			else if(str1[1].equalsIgnoreCase("JUN"))mon1=5;
			else if(str1[1].equalsIgnoreCase("JUL"))mon1=6;
			else if(str1[1].equalsIgnoreCase("AUG"))mon1=7;
			else if(str1[1].equalsIgnoreCase("SEP"))mon1=8;
			else if(str1[1].equalsIgnoreCase("OCT"))mon1=9;
			else if(str1[1].equalsIgnoreCase("NOV"))mon1=10;
			else mon1=11;
			int yr1=Integer.parseInt(str[2]);

			Calendar doj=new GregorianCalendar(yr1, mon1, dat1);
			
			//end of date
			
			
			//starting department
			System.out.println("Select your department");
			getDepartment();
			for(Department d:getDepartment()){
				System.out.println(d.getDepartmentId()+"-->"+d.getName());
			}
			System.out.println("Give your department number:");
			int deptNo=read.nextInt();
			Department d1=null;
			for(Department d:getDepartment()){
				if(d.getDepartmentId()==deptNo){
					d1=d;
					break;
				}
			}
			//department end
			
			
			//project starts
			System.out.println("Select your project");
			getProject();
			for(Project p:getProject()){
				System.out.println(p.getProjectId()+"-->"+p.getName());
			}
			System.out.println("Give your project number:");
			int projNo=read.nextInt();
			Project p1=null;
			for(Project p:getProject()){
				if(p.getProjectId()==projNo){
					p1=p;
					break;
				}
			}
			//project ends
			
			//role starts
			System.out.println("Select your role");
			getRole();
			for(Role r:getRole()){
				System.out.println(r.getRoleId()+"-->"+r.getName());
			}
			System.out.println("Give your role number:");
			int roleNo=read.nextInt();
			Role r1=null;
			for(Role r:getRole()){
				if(r.getRoleId()==roleNo){
					r1=r;
					break;
				}
			}
			
			
			//role ends
	
			emp=new Employee(1, kinId, name, email, address, dob, doj, phone, d1, r1, p1);
//			
//			System.out.println("Do yu wanna continue entering new data[y/n]");
//			choice=read.next();
//			
//			}while(choice.toLowerCase().charAt(0)=='y');
			
			return emp;
	}
	
		public Employee modifyEmployee(List<Employee> lst){
			String kinId;Scanner read=new Scanner(System.in);
			do{
			System.out.println("Enter the KinID:");
			kinId=read.next();
			}while(!Validate.checkKinId(kinId));
			
			for(Employee e:lst){
				if(e.getKinId().equals(kinId)){
					System.out.println("Do modification");
					Employee emp1=addEmployee();
					if(emp1.getKinId().equals(e.getKinId()))return emp1;
					System.out.println("Kin Id mismatch");
					return null;
				}
			}
			
			System.out.println("KinId doesnt exist ");
			return null;
		}
		
		public Employee removeEmployee(List<Employee> lst){
			String kinId;Scanner read=new Scanner(System.in);
			do{
			System.out.println("Enter the KinID to remove");
			kinId=read.next();
			}while(!Validate.checkKinId(kinId));
			
			for(Employee e:lst){
				if(e.getKinId().equals(kinId)){
					System.out.println("Entry Found");
					return e;
				}
			}
			System.out.println("Data not found");
			return null;
		}
	
		public Employee searchEmployee(List<Employee> lst){
			String kinId;Scanner read=new Scanner(System.in);
			String email;String choice;String name;
			do{
			System.out.println(" how do yu wanna search " +
					"\n 1.KinId" +
					"\n 2.Name" +
					"\n 3.email");
			String option=read.next();
			switch(option){
			
			case "1":{
			do{
			System.out.println("Enter the KinID to search");
			kinId=read.next();
			}while(!Validate.checkKinId(kinId));
			
			for(Employee e:lst){
				if(e.getKinId().equals(kinId)){
					System.out.println(e);
				}
			}
			//System.out.println("Data not found");
			break;
			}
			
			case "3":{
				do{
					System.out.println("Enter the emailId to search :");
					email=read.next();
				}while(!Validate.checkEmail(email));
				for(Employee e:lst){
					if(e.getEmailId().equals(email)){
						System.out.println(e);
					}
				}
				System.out.println("Data not found");
				break;	
			}	
			
			case "2":{
				System.out.println("Enter the name :");
				name=read.next();
				
				for(Employee e:lst){
					if(e.getName().equals(name)){
						System.out.println(e);
					}
				}
				System.out.println("Data not found");
				break;
			}
			default :
				System.out.println("not a proper input");
				
		}
			System.out.println("wanna continue search....[y/n]");
			choice=read.next();
			}while(choice.toLowerCase().charAt(0)=='y');
			return null;
	}
}	

