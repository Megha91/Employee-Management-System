package com.flp.ems.util;

public class Validate {

	public static boolean checkKinId(String KinId){
		
		return KinId.matches("[0-9][0-9][0-9][0-9][0-9]_[FTft][Ss]");
	}
	
//	public static void main(String[] args){
//		System.out.println(checkName("sgsg  "));
//	}

	public static boolean checkPhone(String ph){
		return ph.matches("[0][0-9]{10}")||ph.matches("[0-9]{10}")||ph.matches("[+][9][1][0-9]{10}");
	}
	
	public static boolean checkName(String name){
		return name.matches("[a-z A-z]{2,30}");
	}
	
	public static boolean checkEmail(String mail){
		return mail.matches("[a-zA-Z][a-zA-Z_0-9.]*[@][a-zA-Z]*[.][a-zA-z]*");
	}
	
	public static boolean checkDate(String date){
		return date.matches("([0][1-9]|[12][0-9]|[3][0-1])-(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)-(19|20)[0-9]{2}");
	}
	

}
