package com.cog.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cog.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Serializable>{
	
	public StockPrice findByCompanyName(String companyName);

}
