package com.cog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StockPriceExceptionHandler {
	
	@ExceptionHandler(value=CompanyNameNotFoundException.class)
	public ResponseEntity<String> handleCompanyNotFoundException(){
		
		return new ResponseEntity<String>("Company Name Not Found",HttpStatus.BAD_REQUEST);
		
	}

}
