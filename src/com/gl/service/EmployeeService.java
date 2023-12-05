package com.gl.service;

import com.gl.model.Employee;

public interface EmployeeService {
String generateEmailID(String fName,String lName,String deptName);
String generatePassword();
void showEmployeeDetails(Employee e);

}
