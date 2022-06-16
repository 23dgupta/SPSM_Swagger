package com.cog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StockPrice")
public class StockPrice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sId;
	
	private String companyName;
	private Double stockPrice;
	public StockPrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StockPrice(Integer sId, String companyName, Double stockPrice) {
		super();
		this.sId = sId;
		this.companyName = companyName;
		this.stockPrice = stockPrice;
	}

	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}

	@Override
	public String toString() {
		return "StockPrice [sId=" + sId + ", companyName=" + companyName + ", stockPrice=" + stockPrice + "]";
	}
	
	
	
	
	
	
	

}
