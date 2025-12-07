package com.example.employeeapp.exception;


public class IdNotFoundWhileUpdating extends RuntimeException {
		

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IdNotFoundWhileUpdating(String msg){
		super(msg);
	}
	
}
