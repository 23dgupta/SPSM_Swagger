package com.cog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cog.service.StockPriceService;

@RestController
public class StockPriceRestController {
	
	@Autowired
	private StockPriceService stockPriceService;
	
	//http://localhost:9090/swagger-ui.html
	@GetMapping("/stockprice/{companyName}")
	public ResponseEntity<Double> stockPrice(@PathVariable ("companyName")String companyName) {
		 Double stockPrice = stockPriceService.getStockPrice(companyName);
		 return new ResponseEntity<Double>(stockPrice,HttpStatus.OK); 
		
	}

}
