package com.customException;

public class EmployeeRecordNotFound extends RuntimeException{
	
	private String message;
	
	public  EmployeeRecordNotFound(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return "Employee Record Not Avilable";
	}

}
