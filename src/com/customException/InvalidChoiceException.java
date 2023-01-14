package com.customException;

public class InvalidChoiceException extends RuntimeException{
	
	private String message;
	
	public InvalidChoiceException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return "Please Enter Valid Choice";
	}

}
