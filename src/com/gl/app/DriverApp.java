package com.gl.app;

import java.util.Scanner;

import com.gl.service.EmployeeServiceImpl;

public class DriverApp {

	public static void main(String[] args) {
		EmployeeServiceImpl empImpl=new EmployeeServiceImpl();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter First Name");
		String fName=sc.next();
		System.out.println("Please enter last Name");
		String lName=sc.next();
			
		System.out.println("1.technicle");
		System.out.println("2.Admin");
		System.out.println("3.Human Resourse");
		System.out.println("4.legal");
		
		System.out.println("Please choose DeptName");
		int choice=sc.nextInt();
	
		String genEmail="";
		String genPassword="";
		
		
		switch(choice)
		{
		case 1:genEmail=empImpl.generateEmailID(fName.toLowerCase(), lName.toLowerCase(), "tech");break;
		case 2:genEmail=empImpl.generateEmailID(fName.toLowerCase(), lName.toLowerCase(), "admin");break;
		case 3:genEmail=empImpl.generateEmailID(fName.toLowerCase(), lName.toLowerCase(), "hr");break;
		case 4:genEmail=empImpl.generateEmailID(fName.toLowerCase(), lName.toLowerCase(), "legal");break;
		default:System.out.println("please enter valid input");
		}
System.out.println(genEmail);
genPassword=empImpl.generatePassword();
System.out.println(genPassword);

	}

}
