package com.cog.exception;

public class CompanyNameNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7742960714241247975L;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CompanyNameNotFoundException(String message) {
		super();
		this.message = message;
	}
	

}
