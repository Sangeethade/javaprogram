package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	
	//------------------------EMPLOYEE SERVICE IMPLEMENTATION-----------------------------------------//

    Employee saveEmployee(Employee employee);   //save employee details in db
	
	List<Employee> getAllEmployees();  //get all employee details
	
	Employee getEmployeeById(int id);    //get employee details by their id
	
	void deleteEmployeeById(int id);   //delete employee details by their id
	
	Employee updateEmployeeById(Employee employee,int id);   //update employee details by their id in db
	
	Employee getEmployeeByName(String fname);  //get employee details by their first name
	
	Employee getEmployeeByEmail(String email);   //get student details by their Email
	
	Employee getEmployeeByPhone(long phone);  //get student details by their  Phone Number
	
	
}
