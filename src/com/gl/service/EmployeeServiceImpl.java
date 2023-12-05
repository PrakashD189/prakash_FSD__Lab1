package com.gl.service;

import java.util.Random;

import com.gl.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String generateEmailID(String fName, String lName, String deptName) {
		
		return fName+lName+"."+deptName+"@gl.com";
	}

	@Override
	public String generatePassword() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		String splchar="!@#$%^&*()";
		
		String combined=caps+lower+nums+splchar;
		String myPass="";
		
		Random random=new Random();
		for(int i=0;i<=8;i++)
		{
			myPass=myPass+String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		
		return myPass;
	}

	@Override
	public void showEmployeeDetails(Employee e) {
		// TODO Auto-generated method stub
		
	}

}
