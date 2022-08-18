package com.exception;

@SuppressWarnings("serial")
//custom exception for employee not found
public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException(String msg) {
		super(msg);
		
	}

}
