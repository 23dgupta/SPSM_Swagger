package com.cog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cog.entity.StockPrice;
import com.cog.exception.CompanyNameNotFoundException;
import com.cog.repo.StockPriceRepository;

@Service
public class StockPriceServiceImpl  implements StockPriceService{

	@Autowired
	private StockPriceRepository priceRepository ; 
	
	@Override
	public Double getStockPrice(String companyName) {
		// TODO Auto-generated method stub
		 StockPrice sprice = priceRepository.findByCompanyName(companyName);
		 if(sprice==null) {
			 throw new CompanyNameNotFoundException("company name not available");
		 }
		return sprice.getStockPrice();
	}

}
